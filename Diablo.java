import java.util.List;

public class Diablo implements Team {
    List<TeamMember> teamMembers;

    public Diablo() {
        TeamMember geoffrey = new TeamMember("Geoffrey");
        TeamMember richard = new TeamMember("Richard");
        TeamMember kinga = new TeamMember("Kinga");
        TeamMember mike = new TeamMember("Mike");
        TeamMember ty = new TeamMember("Ty");
        TeamMember divya = new TeamMember("Divya");
        TeamMember david = new TeamMember("David");

        teamMembers = List.of(geoffrey, richard, kinga, mike, ty, divya, david);
    }
}
