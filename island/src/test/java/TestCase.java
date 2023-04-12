
import ca.mcmaster.cas.se2aa4.a2.io.MeshFactory;
import ca.mcmaster.cas.se2aa4.a2.io.Structs;
import island.files.IslandGen;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


public class TestCase {

    @Test
    public void meshIsNotNull() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "";
        String rivers = "";
        String aquifers = "";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);
        assertNotNull(myMesh);
    }
    @Test

    public void negativeSeed() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "-212300052508053114";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "";
        String rivers = "";
        String aquifers = "";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
    @Test

    public void incorrectShapeInput() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "14";
        String elevType = "";
        String maxNumLakes = "";
        String rivers = "";
        String aquifers = "";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
    @Test

    public void incorrectAltitudeInput() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "23";
        String maxNumLakes = "";
        String rivers = "";
        String aquifers = "";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }

    @Test
    public void negativeAquifers() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "";
        String rivers = "";
        String aquifers = "-34";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
    @Test
    public void negativeLakes() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "-33";
        String rivers = "";
        String aquifers = "";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
    @Test
    public void negativeRivers() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "";
        String rivers = "-100";
        String aquifers = "";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
    @Test
    public void tooManyAquifers() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "";
        String rivers = "";
        String aquifers = "1000";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
    @Test
    public void tooManyLakes() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "1000";
        String rivers = "";
        String aquifers = "";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
    @Test
    public void tooManyRivers() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "";
        String rivers = "2000";
        String aquifers = "";
        String soil = "";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
    @Test
    public void incorrectSoilInput() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "";
        String rivers = "";
        String aquifers = "";
        String soil = "50";
        String biome = "";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
    @Test
    public void incorrectBiomeInput() throws IOException {
        IslandGen generator = new IslandGen();
        Structs.Mesh aMesh = new MeshFactory().read("../generator/sample.mesh");

        // These are String the User is able to manipulate
        String seed = "";
        String shape = "";
        String elevType = "";
        String maxNumLakes = "";
        String rivers = "";
        String aquifers = "";
        String soil = "";
        String biome = "50";
        String map = "";


        // These are Strings the user is not able to Manipulate
        String elevationStartIdx = "";
        String lakeStartIdx = "";
        String riverStartIdx = "";
        String aquiferStartIdx = "";

        String city = "";
        String cityStartIdx = "";
        Structs.Mesh myMesh = generator.generate(aMesh, seed, shape, elevType, elevationStartIdx, maxNumLakes, lakeStartIdx, rivers, riverStartIdx, aquifers, aquiferStartIdx, soil, biome, map,city,cityStartIdx);        assertNotNull(myMesh);
    }
}
