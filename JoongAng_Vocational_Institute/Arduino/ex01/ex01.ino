void setup() {
  pinMode(13, OUTPUT);  //디지털 13번 핀을 디지털 신호로 출력

}

void loop() {
  digitalWrite(LED_BUILTIN, HIGH); //5V
  delay(1000);            //3초
  digitalWrite(LED_BUILTIN, LOW);  //0V
  delay(1000);            //3초

}
