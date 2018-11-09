(ns wip.himplement
  (:gen-class
   :implements [wip.hello.HInterface]))

(defn hi [something]
  (str "Hello " something "!"))
