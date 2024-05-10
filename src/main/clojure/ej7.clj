(ns ejercicios.ej7 
  (:require
   [clojure.string :refer [lower-case includes?]]))

(defn pangrama? [s]
  (let [alfabeto "abcdefghijklmnñopqrstuvwxyz"
        s (lower-case s)]
    (every? #(includes? s (str %)) alfabeto)))

(assert (pangrama? "Fabio me exige, sin tapujos, que añada cerveza al whisky"))
(assert (not (pangrama? "Esto no es un pangrama")))
