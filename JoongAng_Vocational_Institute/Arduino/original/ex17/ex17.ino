int sled = 0; // 최초 sled  값 0 , 5개의 Led 모두 꺼진 상태 
        // sled 값 1 , 첫번째  LED 켜진 상태(나머지는 꺼진 상태)
        // sled 값 2 , 두번째  LED 켜진 상태(나머지는 꺼진 상태)
        // sled 값 3 , 세번째  LED 켜진 상태(나머지는 꺼진 상태)
        // sled 값 4 , 네번째  LED 켜진 상태(나머지는 꺼진 상태)
        // sled 값 5 , 다섯번째  LED 켜진 상태(나머지는 꺼진 상태)

// 2번핀에 연결된 버튼을 사용 

/*
 * 1.처음에는(RESET) 다섯개의 LED가 모두 꺼저있는 상태 
 * 2.버튼 1번누르면 첫번째 LED 켜짐(나머지 LED 꺼짐)
 * 3.버튼 1번 더 누르면 두번째 LED 켜짐(나머지 LED 꺼짐)
 * 4.버튼 1번 더 누르면 세번째 LED 켜짐(나머지 LED 꺼짐)
 * 5.버튼 1번 더 누르면 네번째 LED 켜짐(나머지 LED 꺼짐)
 * 6.버튼 1번 더 누르면 다섯번째 LED 켜짐(나머지 LED 꺼짐)
 * 7.버튼 1번 더 누르면 다섯개의 LED가 모두 꺼짐
 * 8. 2번부터 다시 실행
*/
void setup() {
 Serial.begin(9600); 
 pinMode(13, OUTPUT); // LED 연결 (디지털 신호 출력)
 pinMode(12, OUTPUT);
 pinMode(11, OUTPUT);
 pinMode(9, OUTPUT);
 pinMode(8, OUTPUT);
 pinMode(2, INPUT); // 버튼 연결 (디지털 신호 입력)
  digitalWrite(13, LOW);  // LED 끄기
  digitalWrite(12, LOW);
  digitalWrite(11, LOW);
  digitalWrite(9, LOW);
  digitalWrite(8, LOW);
  delay(100);
}
void loop() {
  delay(250);
  int value = digitalRead(2); // 0:LOW, 1:HIGH
  if(value == HIGH) { // 버튼을 눌렀을 때
    sled = sled + 1; // 0->1->2->3->4->5->0->...
    if(sled > 5){ sled=0; }
  }
  Serial.print("value: ");
  Serial.print(value);
  Serial.print(" , ");
  Serial.print("sled : ");
  Serial.println(sled); // 아두이노 -> 컴퓨터
  if(sled == 0) { // sled  값 0 , 5개의 Led 모두 꺼진 상태
    digitalWrite(13, LOW); 
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  }
  if(sled == 1) { // sled  값 1 , 첫번째  LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, HIGH); 
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  }
  if(sled == 2) { // sled  값 2 , 두번째  LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, LOW); 
    digitalWrite(12, HIGH);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  }
  if(sled == 3) { // sled  값 3 , 세번째  LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, LOW); 
    digitalWrite(12, LOW);
    digitalWrite(11, HIGH);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  } 
  if(sled == 4) { // sled  값 4 , 네번째  LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, LOW); 
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, HIGH);
    digitalWrite(8, LOW);
  } 
  if(sled == 5) { // sled  값 5 , 다섯번째  LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, LOW); 
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, HIGH);
  }
       
}
