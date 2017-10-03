package test;

import assignment.TetrisPiece;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class TetrisPieceTest {
    @org.junit.Test
    public void getPiece() throws Exception {
    }

    @org.junit.Test
    public void getWidth() throws Exception {
    }

    @org.junit.Test
    public void getHeight() throws Exception {
    }

    @org.junit.Test
    public void getBody() throws Exception {
    }

    @org.junit.Test
    public void getSkirt() throws Exception {
    }

    @org.junit.Test
    public void equals() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(TetrisPiece.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
