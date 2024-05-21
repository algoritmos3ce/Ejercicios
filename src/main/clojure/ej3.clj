(ns main.clojure.ej3)

;; 0 -> 1
;; 1 -> -1
;; 2 -> 1
(defn alt-sign [i]
  (if (even? i) 1 -1))

;; 0 -> 1
;; 1 -> 3
;; 2 -> 5
(defn den [i]
  (+ 1 (* 2 i)))

;; 0 -> 1/1
;; 1 -> -1/3
;; 2 -> 1/5
(defn term-pi [i]
  (* (/ 1 (den i)) (alt-sign i)))

(defn terms-pi [n]
  (map term-pi (range n)))

(defn aprox-pi [n]
  (double (* 4 (reduce + (terms-pi n)))))
