(ns sum-of-pairs.core-test
   (:require [clojure.test :refer :all]
             [sum-of-pairs.core :refer [sum-of-pairs]]))

 (deftest valid-cases
   (testing "one pair sums up to the target number"
     (is (= [[2 6]] (sum-of-pairs [2 4 5 6] 8))))
   (testing "two different pairs sums up to the target number"
     (is (= [[2 3] [0 5]] (sum-of-pairs [3 2 0 1 1 5] 5))))
   (testing "two duplicate pairs sums up to the target number"
     (is (= [[3 4] [3 4]] (sum-of-pairs [1 3 2 3 4 5] 7)))))