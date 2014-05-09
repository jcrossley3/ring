(defproject ring/ring-core "1.3.0-beta1"
  :description "Ring core libraries."
  :plugins [[lein-modules "0.3.1"]]
  :dependencies [[org.clojure/tools.reader "0.8.1"]
                 [ring/ring-codec "1.0.0"]
                 [commons-io "2.4"]
                 [commons-fileupload "1.3"]
                 [clj-time "0.6.0"]
                 [crypto-random "1.2.0"]
                 [crypto-equality "1.0.0"]]
  :profiles
  {:provided {:dependencies [[javax.servlet/servlet-api "_"]]}
   :dev {:dependencies [[javax.servlet/servlet-api "_"]]}})
