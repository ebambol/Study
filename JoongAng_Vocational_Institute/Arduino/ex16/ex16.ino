byte sled = 0b00000000; //최초 sled 값 0, 꺼진 상태 0
              //sled 값 1 , 켜진상태 1
              //2번핀이 연결된 버튼을 토글 버튼으로 만들기 LED 켜기 <=> LED끄기
//1. led 5개 off -> 버튼 -> 1번째 led on -> 버튼 -> 1번째 led off, 2번째 on -> 버튼 -> 2off 3on

void setup() {
  Serial.begin(9600);
  pinMode(13, OUTPUT);  //LED 연결 (디지털 출력)
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(2, INPUT);  //버튼 연결 (디지털 입력)
}

void loop() {
  int value = digitalRead(2); //버튼 확인
  
  Serial.print("Light:\t");
  Serial.print(value);
  Serial.print("\tsled: \t");
  Serial.println(sled);
  if(value == HIGH){
    if(sled==0b00000000){
      sled=0b00000001;
    }
    sled = sled << 1;
    delay(500);
  }

  if(sled == 0b00000010){
    digitalWrite(13,HIGH);
  }else if(sled == 0b00000100){
    digitalWrite(13,LOW);
    digitalWrite(12,HIGH);
  }else if(sled == 0b00001000){
    digitalWrite(12,LOW);
    digitalWrite(11,HIGH);
  }else if(sled == 0b00010000){
    digitalWrite(11,LOW);
    digitalWrite(9,HIGH);
  }else if(sled == 0b00100000){
    digitalWrite(9,LOW);
    digitalWrite(8,HIGH);
  }
  else if(sled == 0b01000000){
    sled=0b00000010;
    digitalWrite(8,LOW);
  }
}
