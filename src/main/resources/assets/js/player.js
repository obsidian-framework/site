document.addEventListener('DOMContentLoaded', () => {
    const el = document.querySelector('[class="player"]');
    if (!el) return;
    const id = el.getAttribute('live:id');
    const a = document.querySelector('#audio-' + id);
    if (!a) return;
    const bar = document.querySelector('[data-target="audio-' + id + '"]');
    const time = document.querySelector('[data-time="audio-' + id + '"]');
    const fmt = s => Math.floor(s/60) + ':' + String(Math.floor(s%60)).padStart(2,'0');

    a.ontimeupdate = () => {
        bar.value = (a.currentTime / a.duration * 100) || 0;
        time.textContent = fmt(a.currentTime) + ' / ' + fmt(a.duration || 0);
    };
    bar.oninput = () => a.currentTime = bar.value / 100 * a.duration;
    a.onended = () => document.querySelector('[live\\:click="next"]')?.click();

    new MutationObserver(() => {
        const src = a.getAttribute('src');
        if (a.dataset.last !== src) { a.load(); a.dataset.last = src; }
        a.play().catch(() => {});
    }).observe(el, { childList: true, subtree: true });
});