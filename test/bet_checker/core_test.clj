(ns bet-checker.core-test
  (:require [clojure.test :refer :all]
            [bet-checker.core :refer :all]))

(deftest test-check-bet
  (testing "FIXME, I fail."
    (is (= (check-bet '(0,1) '(1,0)) 0))
    (is (= (check-bet '(1,1) '(1,1)) 2))
    (is (= (check-bet '(3,3) '(1,1)) 1))
    (is (= (check-bet '(5,2) '(3,0)) 1))))
