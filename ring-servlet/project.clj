(defproject ring/ring-servlet "1.3.0-beta1"
  :description "Ring servlet utilities."
  :plugins [[lein-modules "0.3.1"]]
  :profiles
  {:provided {:dependencies [[javax.servlet/servlet-api "_"]]}
   :dev {:dependencies [[javax.servlet/servlet-api "_"]]}})
