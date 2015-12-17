(ns nodecljs.core)

(enable-console-print!)

(defn -main [& args]
  (println "Hello, World!"))

(set! *main-cli-fn* -main)
