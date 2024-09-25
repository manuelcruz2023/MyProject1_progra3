package co.edu.uptc.view.dialogs.dialogVehicleAnalysis;

import javax.swing.JDialog;

import co.edu.uptc.view.dialogs.dialogVehicleAnalysis.panelsVehicleAnalysis.VehicleAnalysisBody;
import co.edu.uptc.view.dialogs.dialogVehicleAnalysis.panelsVehicleAnalysis.VehicleAnalysisHeader;
import co.edu.uptc.view.main.mainPanels.PanelMainBody;

public class MainVehicleAnalysis extends JDialog{
    
    PanelMainBody panelMainBody;

    public MainVehicleAnalysis(PanelMainBody panelMainBody) {
        super(panelMainBody.mainView, true);
        this.panelMainBody = panelMainBody;
        initComponents();
        createPanels();
    }

    private void initComponents() {
        setTitle("Análisis de vehículos");
        this.setSize(1200, 800);
        setLocationRelativeTo(this.panelMainBody.mainView);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void begin() {
        setVisible(true);
    }

    private void CreateHeader (){
        VehicleAnalysisHeader header = new VehicleAnalysisHeader();
        this.add(header);
    }

    private void CreateBody (){
        VehicleAnalysisBody body = new VehicleAnalysisBody();
        this.add(body);
    }

    private void createPanels() {
        CreateHeader();
        CreateBody();
    }
}
