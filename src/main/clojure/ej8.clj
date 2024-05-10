(ns ejercicios.ej8)

(defn profundidad [s]
  (if (seq? s)
    (+ 1 (apply max (map profundidad s)))
    0))

(assert (= 4 (profundidad '((2 3)(3 ((7))) 5))))
