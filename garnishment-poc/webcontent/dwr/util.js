/**
 * Minimal stub of DWR util.js to prevent missing function errors
 * This provides placeholder utility methods often used with DWR
 */

var dwr = dwr || {};
dwr.util = {
  setValue: function (id, value) {
    const el = document.getElementById(id);
    if (el) el.value = value;
  },
  getValue: function (id) {
    const el = document.getElementById(id);
    return el ? el.value : null;
  },
  setInnerHTML: function (id, html) {
    const el = document.getElementById(id);
    if (el) el.innerHTML = html;
  },
  byId: function (id) {
    return document.getElementById(id);
  },
  addRows: function (id, rows, cellFunc) {
    console.warn(`[DWR Stub] addRows called on id=${id}, rows=${rows}`);
  },
};
