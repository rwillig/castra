(set-env!
  :resource-paths #{"src"}
  :dependencies '[[adzerk/bootlaces           "0.1.9"         :scope "test"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "3.0.0")

(task-options!
 pom  {:project     'tailrecursion/castra
       :version     +version+
       :description "castra RPC for hoplon web apps"
       :url         "https:/github.com/tailrecursion/castra"
       :scm         {:url "https://github.com/tailrecursion/castra"}
       :license     {"" ""}})

