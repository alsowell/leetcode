while :
do
  input tap 500 250
  echo "点击拍照等待7s点击返回按钮"
  sleep 7
  echo "开始点击返回按钮"
  input tap 700 100
  echo "点击返回按钮,等待2s"
  sleep 2
  echo "返回结束"
done