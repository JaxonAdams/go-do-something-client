(ns go-do-something-client.prod
  (:require [go-do-something-client.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
