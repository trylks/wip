(ns wip.core
  (:gen-class)
  (:require [wip.himplement :refer [hi]]))

(defn -classes []
  (let [classloader (.getClassLoader clojure.main)
        classes-field (.getDeclaredField java.lang.ClassLoader "classes")]
    (.setAccessible classes-field true)
    (let [class-list (.get classes-field classloader)
          class-vec (reduce conj [] class-list)]
      class-vec)))

(defn -main [& args]
  (println (hi "world"))
  (println (->> (-classes) (map str) (filter #(.contains % "implement")))))
