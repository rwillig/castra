(set-env!
  :resource-paths #{"src"}
  :dependencies '[[org.clojure/clojure        "1.6.0"         :scope "provided"]
                  [adzerk/bootlaces           "0.1.9"         :scope "test"]
                  [cheshire                   "5.2.0"]
                  [ring/ring-core             "1.2.1"]
                  [ring/ring-jetty-adapter    "1.2.1"]
                  [tailrecursion/cljson       "1.0.6"]
                  [tailrecursion/extype       "0.1.0"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "3.0.0")

(task-options!
 pom  {:project     'tailrecursion/castra
       :version     +version+
       :description "castra RPC for hoplon web apps"
       :url         "https:/github.com/tailrecursion/castra"
       :scm         {:url "https://github.com/tailrecursion/castra"}
       :license     {"" ""}})

