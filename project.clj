(defproject nodecljs "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.189"]
                 [com.cemerick/piggieback "0.2.1"]]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-npm "0.6.1"]]
  :cljsbuild {:builds [{:source-paths ["src/nodecljs"]
                        :compiler {:optimizations :simple
                                   :output-to "nodecljs.js"
                                   :source-map "nodecljs.js.map"
                                   :target :nodejs}}]}
  :npm {:dependencies [[source-map-support "0.4.0"]]}
  :main "nodecljs.js")
