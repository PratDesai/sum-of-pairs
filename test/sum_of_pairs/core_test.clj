(ns sum-of-pairs.core-test
   (:require [clojure.test :refer :all]
             [sum-of-pairs.core :refer [sum-of-pairs combo-pairs]]))
 
 (deftest pairs-test
   (testing "empty input returns empty list"
     (is (= [] (combo-pairs []))))
   (testing "one number returns empty list"
     (is (= [] (combo-pairs [1]))))
   (testing "two numbers returns one pair"
     (is (= [[1 2]] (combo-pairs [1 2]))))
   (testing "three numbers returns three pairs"
     (is (= [[1 2] [1 3] [2 3]] (combo-pairs [1 2 3]))))
   (testing "four numbers returns six pairs"
     (is (= [[1 2] [1 3] [1 4] [2 3] [2 4] [3 4]] (combo-pairs [1 2 3 4])))))

 (deftest sum-of-pairs-tests
   (testing "one pair sums up to the target number"
     (is (= [[2 6]] (sum-of-pairs [2 4 5 6] 8))))
   (testing "two different pairs sums up to the target number"
     (is (= [[2 3] [0 5]] (sum-of-pairs [3 2 0 1 1 5] 5))))
   (testing "two duplicate pairs sums up to the target number"
     (is (= [[3 4] [2 5] [3 4]] (sum-of-pairs [1 3 2 3 4 5] 7)))))