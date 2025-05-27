/**
 * Minimal stub of DWR engine.js to prevent browser errors
 * NOTE: This is a fake version — DWR is supposed to generate this dynamically
 */

var dwr = dwr || {};
dwr.engine = {
  _path: "/garnishment-poc/dwr",
  _execute: function (path, className, methodName, callback, ...args) {
    console.warn(
      `[DWR Fake Engine] Trying to call: ${className}.${methodName}`
    );
    console.log(`[DWR Args]`, args);

    // simulate success callback
    if (typeof callback === "function") {
      callback({ status: "fake response from DWR stub" });
    }
  },
};
