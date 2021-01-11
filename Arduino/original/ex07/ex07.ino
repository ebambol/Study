void setup() {
 pinMode(13, OUTPUT); // 빨강
 pinMode(12, OUTPUT); // 노랑
 pinMode(11, OUTPUT); // 초록
 digitalWrite(13, HIGH); //LED 켜기
 digitalWrite(12, HIGH);
 digitalWrite(11, HIGH);
 delay(5000); //5초동안 상태 유지, 1000 -> 1초
 digitalWrite(13, LOW); //LED 끄기
 digitalWrite(12, LOW);
 digitalWrite(11, LOW); 
 delay(10);
}

void loop() {
 // 빨강1초켜기 -> 빨강끄기 -> 노랑1초켜기->노랑끄기->초록1초켜고->초록끄기
  digitalWrite(13, HIGH); //빨강켜기
  delay(1000);
  digitalWrite(13, LOW);
  delay(100);
  digitalWrite(12, HIGH); //노랑켜기
  delay(1000);
  digitalWrite(12, LOW);
  delay(100);
  digitalWrite(11, HIGH); //초록켜기
  delay(1000);
  digitalWrite(11, LOW);
  delay(100);
}
