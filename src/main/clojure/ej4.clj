(ns main.clojure.ej4)

(defn nth-fibo [n]
  (case n
    (0 1) 1
    (+ (nth-fibo (- n 1)) (nth-fibo (- n 2)))))

(assert (= '(1 1 2 3 5 8 13) (map nth-fibo (range 7))))

