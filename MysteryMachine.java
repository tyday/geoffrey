import java.util.List;

public class MysteryMachine implements Team {
    List<TeamMember> teamMembers;

    public MysteryMachine() {
        TeamMember rosmi = new TeamMember("Rosmi");
        TeamMember richard = new TeamMember("Richard");
        TeamMember david = new TeamMember("David");

        teamMembers = List.of(geoffrey, rosmi, richard, kinga, frank, mike, ty, divya, david);
        // :(
    }
}
