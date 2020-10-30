(ns sum-of-pairs.core
  (:gen-class))

(defn combo-pairs [nums]
  (let [fs (map repeat nums)
        rs (rest nums)
        ps (take (count rs) (iterate rest rs))
        vec->sort (comp sort vector)]
    (mapcat (fn [n ps] (map vec->sort n ps)) fs ps)))

(defn sum-of-pairs [nums target]
  (->> nums
       combo-pairs
       (filter (fn [[n p]] (= target (+ n p))))))