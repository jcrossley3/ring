(defproject ring "1.3.0-beta1"
  :description "A Clojure web applications library."
  :plugins
    [[lein-modules "0.3.1"]]
  :modules
    {:inherited
     {:url "https://github.com/ring-clojure/ring"
      :license {:name "The MIT License"
                :url "http://opensource.org/licenses/MIT"}
      :scm {:dir ".."}
      :aliases {"all" ^:displace ["do" "clean," "test," "install"]}}

     :versions {ring            "1.3.0-beta1"
                ring/ring-codec "1.0.0"
                javax.servlet   "2.5"}}

  :profiles
    {:dev {:dependencies [[org.clojure/clojure "1.3.0"]]}
     :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
     :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
     :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
     :travis {:modules {:subprocess "lein2"}}})
