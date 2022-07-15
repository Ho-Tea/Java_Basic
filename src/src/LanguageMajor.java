public class LanguageMajor implements Major{
    private String vital;
    private String normal;
    private Subject subject;
    LanguageMajor(){
        vital = subject.getKorean();
        normal = subject.getMath();
    }
    @Override
    public String getVitalSubject() {
        return vital;
    }

    @Override
    public void changeVitalSubject(String newvital) {
        this.vital = newvital;
    }

    @Override
    public String getNormalSubject() {
        return normal;
    }
}
