import java.util.List;

public class MysteryMachine implements Team {
    List<TeamMember> teamMembers;

    public MysteryMachine() {
        TeamMember rosmi = new TeamMember("Rosmi");
        TeamMember richard = new TeamMember("Richard");
        TeamMember kinga = new TeamMember("Kinga");
        TeamMember mike = new TeamMember("Mike");
        TeamMember ty = new TeamMember("Ty");
        TeamMember divya = new TeamMember("Divya");
        TeamMember david = new TeamMember("David");

        teamMembers = List.of(rosmi, richard, kinga, mike, ty, divya, david);
    }
}
