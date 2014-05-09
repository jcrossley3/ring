(defproject ring/ring-jetty-adapter "1.3.0-beta1"
  :description "Ring Jetty adapter."
  :plugins [[lein-modules "0.3.1"]]
  :dependencies [[ring/ring-core "_"]
                 [ring/ring-servlet "_"]
                 [org.eclipse.jetty/jetty-server "7.6.8.v20121106"]]
  :profiles
  {:dev {:dependencies [[clj-http "0.6.4"]]}})
