const ProductsStore = {
  state: {
    products: [{name:"Laptop",desc:"High performance",image:"laptop.png"},{name:"Phone",desc:"Latest model",image:"phone.png"},{name:"Tablet",desc:"Lightweight and fast",image:"tablet.png"}]
  },
  actions: {},
  reducer: {},
  selectors: {}
};

// Application logic
let appState = ProductsStore.state;
function dispatch(type, payload) {
  const reducer = ProductsStore.reducer[type];
  if (reducer) appState = reducer(appState, payload);
}
function select(selector) {
  return selector(appState);
}

function mount() {
  const app = document.getElementById("app");

  document.querySelectorAll("[data-ngif]").forEach(el => {
    const condition = el.getAttribute("data-ngif");
    try {
      if (!eval(condition)) el.style.display = "none";
    } catch (e) {
      console.warn("ngIf eval error:", e);
    }
  });

  document.querySelectorAll("[data-ngfor]").forEach(el => {
    const expr = el.getAttribute("data-ngfor");
    const [item, list] = expr.split(" of ");
    const data = select(ProductsStore.selectors[list.trim()]);
    const template = el.cloneNode(true);
    el.innerHTML = "";
    data.forEach(val => {
      const clone = template.cloneNode(true);
      clone.removeAttribute("data-ngfor");
      const regex = new RegExp(`{{\\s*${item.trim()}\\.(\\w+)\\s*}}`, "g");
      clone.innerHTML = clone.innerHTML.replace(regex, (_, prop) => val[prop]);
      el.appendChild(clone);
    });
  });
  document.querySelectorAll("[onclick]").forEach(el => {
    const handler = el.getAttribute("onclick");
    el.addEventListener("click", () => {
      try {
        eval(handler);
      } catch (e) {
        console.warn("onclick eval error:", e);
      }
    });
  });
  document.querySelectorAll("[oninput]").forEach(el => {
    const handler = el.getAttribute("oninput");
    el.addEventListener("input", () => {
      try {
        eval(handler);
      } catch (e) {
        console.warn("oninput eval error:", e);
      }
    });
  });
}
document.addEventListener("DOMContentLoaded", mount);
