int sled = 0; // 최초 sled  값 0 , 꺼진 상태 0
              // sled 값 1 , 켜진 상태 1
// 2번핀에 연결된 버튼을 토글 버튼으로 만들기  LED켜기 <===> LED끄기
void setup() {
 Serial.begin(9600); 
 pinMode(13, OUTPUT); // LED 연결 (디지털 신호 출력)
 pinMode(12, OUTPUT);
 pinMode(11, OUTPUT);
 pinMode(9, OUTPUT);
 pinMode(8, OUTPUT);
 pinMode(2, INPUT); // 버튼 연결 (디지털 신호 입력)
}
void loop() {
  delay(250);
  int value = digitalRead(2); // 0:LOW, 1:HIGH
  Serial.print("value: ");
  Serial.print(value);
  Serial.print(" , ");
  Serial.print("sled : ");
  Serial.println(sled); // 아두이노 -> 컴퓨터
  if(value == HIGH) { // 버튼을 눌렀을 때
    if(sled==1){ sled=0; }else{sled=1;}
  }
  
  
  if(sled == 1) { // sled == 1
    digitalWrite(13, HIGH); // LED 켜기
    digitalWrite(12, HIGH);
    digitalWrite(11, HIGH);
    digitalWrite(9, HIGH);
    digitalWrite(8, HIGH);
  }else { // sled == 0
    digitalWrite(13, LOW);  // LED 끄기
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  }
}
