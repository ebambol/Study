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
 // 빨강5초켜기 -> 빨강끄기 -> 5 x(노랑0.5초켜기->0.5노랑끄기)->초록5초켜고->초록끄기
  digitalWrite(13, HIGH); //빨강켜기
  delay(5000); //5초동안 상태 유지
  digitalWrite(13, LOW); //빨강끄기
  for(int i=0;i < 5; i++){ //i=0, i=1, i=2, i=3, i=4
    digitalWrite(12, HIGH); //노랑켜기
    delay(500); // 0.5초 켠상태 유지
    digitalWrite(12, LOW); //노랑끄기
    delay(500); // 0.5초 끈상태 유지
  }
  digitalWrite(11, HIGH); //초록켜기
  delay(5000);
  digitalWrite(11, LOW); 
}
