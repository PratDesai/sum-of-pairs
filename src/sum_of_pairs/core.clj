(ns sum-of-pairs.core
  (:gen-class))

(defn pairs [vals]
  (cond (<= (count vals) 1) []
        (= (count vals) 2) [vals]
        :else (loop [n (first vals) vals (rest vals) acc []]
                (if (= 0 (count vals))
                  acc
                  (recur (first vals)
                         (rest vals)
                         (into acc (map #(vector n %) vals)))))))

(defn sum-of-pairs [vals target]
  [[0 0]])

(comment
  (def data [1 2 3 4])
  (pairs data)
  (loop [n (first data) vals (rest data) acc []]
    (if (= 0 (count vals))
      acc
      (recur (first vals)
             (rest vals)
             (conj acc [n vals])))))