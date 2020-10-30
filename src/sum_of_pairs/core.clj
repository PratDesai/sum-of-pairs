(ns sum-of-pairs.core
  (:gen-class))

(defn combo-pairs [nums]
  (let [fs (drop-last nums)
        rs (rest nums)
        ps (take (count rs) (iterate rest rs))]
    (mapcat (fn [n ps] (map (fn [p] (sort [n p])) ps)) fs ps)))

(defn sum-of-pairs [nums target]
  (->> nums
       combo-pairs
       (filter (fn [[n p]] (= target (+ n p))))))