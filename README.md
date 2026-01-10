# Selenium Cucumber Sample project


## GitHub Actions 사전 설정 (필수)

이메일 전송 기능과 workflow 실행을 위해, 먼저 리포지토리 설정을 확인해야 합니다:

1. GitHub에서 리포지토리 접속 → `Settings` 클릭
2. 좌측 메뉴에서 `Actions` → `General` 선택
3. 하단으로 스크롤 → **Workflow permissions** 섹션
4. 아래처럼 설정
    - (●) **Read and write permissions**
    - [✓] **Allow GitHub Actions to create and approve pull requests**
5. **Save** 버튼 클릭

![img.png](img.png)

![img_1.png](img_1.png)

> 반드시 이 설정을 완료해야 이메일 전송과 workflow 실행이 정상적으로 동작합니다.

---

# Selenium Cucumber 프로젝트

이 프로젝트는 Selenium과 Cucumber를 사용한 UI 테스트 자동화 프로젝트입니다.  
테스트 실행 후, GitHub Pages에 리포트가 생성됩니다.

---

## 테스트 리포트 확인

리포트는 아래 링크에서 확인할 수 있습니다:

[🔗 테스트 리포트 보기](https://jhj2867.github.io/selenium-project)

---

## 이메일로 리포트 받기

테스트 리포트를 이메일로 받고 싶다면 아래 링크를 클릭하세요.  
GitHub Actions 페이지로 이동한 뒤, 이메일을 입력하고 **Run workflow** 버튼을 누르면 자동으로 이메일이 발송됩니다.

[📧 이메일 전송하기](https://github.com/jhj2867/selenium-project/actions/workflows/ui-test.yml)

---

## 사용 방법

1. **테스트 리포트 확인**
    - GitHub Pages 링크 클릭
2. **이메일 전송**
    - 위 “이메일 전송하기” 링크 클릭
    - GitHub Actions 페이지에서 이메일 입력
    - Run workflow 클릭
    - 완료 후 입력한 이메일로 테스트 리포트 URL 전송

---

## 참고 사항

- 이메일 발송 기능은 GitHub Actions와 SMTP 서버를 이용합니다.
- SMTP 계정 정보는 GitHub Secrets(`EMAIL_USER`, `EMAIL_PASS`)에 저장되어야 합니다.
- GitHub Actions 실행 권한이 필요합니다.
