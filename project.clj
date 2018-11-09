(defproject wip "0.1.0"
  :description "This is just a test, for asking a question"
  :url "http://github.com/trylks/clojuretest"
  :license { :name "Apache License 2.0"
             :url "https://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.reflections/reflections "0.9.11"]]
  :main wip.core
  :souce-paths ["src"]
  :test-paths ["test/clj/wip"]
  :java-source-paths ["src/java/wip"]
  :target-path "target/%s")
