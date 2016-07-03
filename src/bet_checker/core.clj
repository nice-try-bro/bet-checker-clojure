(ns bet-checker.core)

(defn get-diff
  "Get goal difference."
  [score]
  (- (first score) (first (rest score))))

(defn same-result?
  "Check if bet result was correct."
  [bet-score, actual-score]
  (>= (* (get-diff bet-score) (get-diff actual-score)) 0))

(defn check-bet
  "Check if bet worked. 2 - correct score, 1 - correct result, 0 - wrong bet."
  [bet-score, actual-score]
  (cond 
    (= bet-score actual-score) 2
    (same-result? bet-score actual-score) 1
    :else 0))

