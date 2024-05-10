(ns ejercicios.ej5)

(defn qsort [s]
  (if (empty? s)
    s
    (let [pivot (first s)
          r (rest s)]
      (concat
        (qsort (filter #(<= % pivot) r))
        [pivot]
        (qsort (filter #(> % pivot) r))))))

(assert (= '(1 2 3 4 5 6) (qsort '(1 4 3 2 6 5))))
