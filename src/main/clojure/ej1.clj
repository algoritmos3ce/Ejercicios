(ns main.clojure.ej1
  (:gen-class))

(defn segundos [dias horas minutos segundos]
  (+ segundos
     (* minutos 60)
     (* horas 60 60)
     (* dias 60 60 24)))

(assert (= 3660 (segundos 0 1 1 0)))
