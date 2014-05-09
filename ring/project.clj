(defproject ring "1.3.0-beta1"
  :description "A Clojure web applications library."
  :plugins [[lein-modules "0.3.1"]
            [codox "0.7.3"]]
  :packaging "pom"

  :dependencies
  [[ring/ring-core "_"]
   [ring/ring-devel "_"]
   [ring/ring-jetty-adapter "_"]
   [ring/ring-servlet "_"]]

  :aliases {"all" ["do" "clean," "doc," "install"]}
  
  :codox
    {:src-dir-uri "http://github.com/ring-clojure/ring/blob/1.2.2/"
     :src-linenum-anchor-prefix "L"
     :output-dir "target/doc"
     :sources ["../ring-core/src"
               "../ring-devel/src"
               "../ring-jetty-adapter/src"
               "../ring-servlet/src"]})
