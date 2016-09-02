package vn.vnext.fridaynight.models;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "product", schema = "safuri_schema", catalog = "")
public class ProductEntity {
    private int productId;
    private int dealDealId;
    private Integer inspection;
    private int lotInput;
    private int throughInput;
    private String productName;
    private int paperPaperId;
    private Integer verticalPageSize;
    private Integer horizontalPageSize;
    private Integer cutVerticalPageSize;
    private Integer cutHorizontalPageSize;
    private Integer blankVerticalPageSize;
    private Integer blankHorizontalPageSize;
    private int takenNumber;
    private int impositionNumber;
    private int paperActualWeight;
    private BigDecimal paperUnitPrice;
    private int paperTotalCost;
    private Integer specialColor1;
    private int colorColorId2;
    private Integer specialColor2;
    private int colorPlateCost1;
    private int colorPlateCost2;
    private int colorPrintLoss1;
    private int colorPrintLoss2;
    private int colorPrintPerPacketCost1;
    private int colorPrintPerPacketCost2;
    private int colorPrintBasicCost1;
    private int colorPrintBasicCost2;
    private BigDecimal colorPrintThroughWage1;
    private BigDecimal colorPrintThroughWage2;
    private BigDecimal colorPrintSpecial1;
    private BigDecimal colorPrintSpecial2;
    private int colorPrintTotalCost1;
    private int colorPrintTotalCost2;
    private int surfaceTreatmentSurfaceTreatmentId1;
    private int surfaceTreatmentSurfaceTreatmentId2;
    private String surfaceTreatmentBasicCost1;
    private String surfaceTreatmentBasicCost2;
    private String surfaceTreatmentThroughWage1;
    private String surfaceTreatmentThroughWage2;
    private int surfaceTreatmentTotalCost1;
    private int surfaceTreatmentTotalCost2;
    private byte embossing;
    private int embossingBasicCost;
    private BigDecimal embossingThroughWage;
    private int embossingTotalCost;
    private String laminationFlute;
    private int laminationMediumBasicWeight;
    private int laminationMediumThroughWage;
    private int laminationBackBasicWeight;
    private int laminationBackBasicThroughWage;
    private int laminationNumber;
    private int laminationWidth;
    private int laminationCuttingFlow;
    private BigDecimal laminationUnitPrice;
    private BigDecimal laminationSheetCost;
    private BigDecimal laminationtotalCost;
    private int strikingStrikingId;
    private int strikingThroughNumber;
    private int strikingWeight;
    private int strikingLoss;
    private int strikingBasicCost;
    private BigDecimal strikingThroughWage;
    private int strikingTotalCost;
    private int stampingStampingId;
    private String stampingProcessingType;
    private int stampingNumber;
    private int stampingBasicCost;
    private BigDecimal stampingThroughWage;
    private int stampingTotalCost;
    private int windowMarginWindowMarginId;
    private int windowVerticalSize;
    private int windowHorizontalSize;
    private BigDecimal windowMaterialFee;
    private int windowTotalCost;
    private int pastePasteId;
    private String pasteForm;
    private int pasteBlankSize;
    private byte pasteSpecialForm;
    private int pasteLoss;
    private int pasteBasicCost;
    private BigDecimal pasteThroughWage;
    private int pasteTotalCost;
    private Integer otherCost1;
    private Integer otherCost2;
    private Integer otherCost3;
    private int subTotal1;
    private Integer packingFee;
    private int packingPackingId;
    private int subTotal2;
    private int managementCost;
    private int fare;
    private int estimatedSum;
    private int estimatedUnitPrice;
    private int submittedSum;
    private int submittedUnitPrice;
    private int colorColorId;

    @Id
    @Column(name = "productID")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "Deal_dealID")
    public int getDealDealId() {
        return dealDealId;
    }

    public void setDealDealId(int dealDealId) {
        this.dealDealId = dealDealId;
    }

    @Basic
    @Column(name = "inspection")
    public Integer getInspection() {
        return inspection;
    }

    public void setInspection(Integer inspection) {
        this.inspection = inspection;
    }

    @Basic
    @Column(name = "lotInput")
    public int getLotInput() {
        return lotInput;
    }

    public void setLotInput(int lotInput) {
        this.lotInput = lotInput;
    }

    @Basic
    @Column(name = "throughInput")
    public int getThroughInput() {
        return throughInput;
    }

    public void setThroughInput(int throughInput) {
        this.throughInput = throughInput;
    }

    @Basic
    @Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "Paper_paperID")
    public int getPaperPaperId() {
        return paperPaperId;
    }

    public void setPaperPaperId(int paperPaperId) {
        this.paperPaperId = paperPaperId;
    }

    @Basic
    @Column(name = "verticalPageSize")
    public Integer getVerticalPageSize() {
        return verticalPageSize;
    }

    public void setVerticalPageSize(Integer verticalPageSize) {
        this.verticalPageSize = verticalPageSize;
    }

    @Basic
    @Column(name = "horizontalPageSize")
    public Integer getHorizontalPageSize() {
        return horizontalPageSize;
    }

    public void setHorizontalPageSize(Integer horizontalPageSize) {
        this.horizontalPageSize = horizontalPageSize;
    }

    @Basic
    @Column(name = "cutVerticalPageSize")
    public Integer getCutVerticalPageSize() {
        return cutVerticalPageSize;
    }

    public void setCutVerticalPageSize(Integer cutVerticalPageSize) {
        this.cutVerticalPageSize = cutVerticalPageSize;
    }

    @Basic
    @Column(name = "cutHorizontalPageSize")
    public Integer getCutHorizontalPageSize() {
        return cutHorizontalPageSize;
    }

    public void setCutHorizontalPageSize(Integer cutHorizontalPageSize) {
        this.cutHorizontalPageSize = cutHorizontalPageSize;
    }

    @Basic
    @Column(name = "blankVerticalPageSize")
    public Integer getBlankVerticalPageSize() {
        return blankVerticalPageSize;
    }

    public void setBlankVerticalPageSize(Integer blankVerticalPageSize) {
        this.blankVerticalPageSize = blankVerticalPageSize;
    }

    @Basic
    @Column(name = "blankHorizontalPageSize")
    public Integer getBlankHorizontalPageSize() {
        return blankHorizontalPageSize;
    }

    public void setBlankHorizontalPageSize(Integer blankHorizontalPageSize) {
        this.blankHorizontalPageSize = blankHorizontalPageSize;
    }

    @Basic
    @Column(name = "takenNumber")
    public int getTakenNumber() {
        return takenNumber;
    }

    public void setTakenNumber(int takenNumber) {
        this.takenNumber = takenNumber;
    }

    @Basic
    @Column(name = "impositionNumber")
    public int getImpositionNumber() {
        return impositionNumber;
    }

    public void setImpositionNumber(int impositionNumber) {
        this.impositionNumber = impositionNumber;
    }

    @Basic
    @Column(name = "paperActualWeight")
    public int getPaperActualWeight() {
        return paperActualWeight;
    }

    public void setPaperActualWeight(int paperActualWeight) {
        this.paperActualWeight = paperActualWeight;
    }

    @Basic
    @Column(name = "paperUnitPrice")
    public BigDecimal getPaperUnitPrice() {
        return paperUnitPrice;
    }

    public void setPaperUnitPrice(BigDecimal paperUnitPrice) {
        this.paperUnitPrice = paperUnitPrice;
    }

    @Basic
    @Column(name = "paperTotalCost")
    public int getPaperTotalCost() {
        return paperTotalCost;
    }

    public void setPaperTotalCost(int paperTotalCost) {
        this.paperTotalCost = paperTotalCost;
    }

    @Basic
    @Column(name = "specialColor1")
    public Integer getSpecialColor1() {
        return specialColor1;
    }

    public void setSpecialColor1(Integer specialColor1) {
        this.specialColor1 = specialColor1;
    }

    @Basic
    @Column(name = "Color_colorID2")
    public int getColorColorId2() {
        return colorColorId2;
    }

    public void setColorColorId2(int colorColorId2) {
        this.colorColorId2 = colorColorId2;
    }

    @Basic
    @Column(name = "specialColor2")
    public Integer getSpecialColor2() {
        return specialColor2;
    }

    public void setSpecialColor2(Integer specialColor2) {
        this.specialColor2 = specialColor2;
    }

    @Basic
    @Column(name = "colorPlateCost1")
    public int getColorPlateCost1() {
        return colorPlateCost1;
    }

    public void setColorPlateCost1(int colorPlateCost1) {
        this.colorPlateCost1 = colorPlateCost1;
    }

    @Basic
    @Column(name = "colorPlateCost2")
    public int getColorPlateCost2() {
        return colorPlateCost2;
    }

    public void setColorPlateCost2(int colorPlateCost2) {
        this.colorPlateCost2 = colorPlateCost2;
    }

    @Basic
    @Column(name = "colorPrintLoss1")
    public int getColorPrintLoss1() {
        return colorPrintLoss1;
    }

    public void setColorPrintLoss1(int colorPrintLoss1) {
        this.colorPrintLoss1 = colorPrintLoss1;
    }

    @Basic
    @Column(name = "colorPrintLoss2")
    public int getColorPrintLoss2() {
        return colorPrintLoss2;
    }

    public void setColorPrintLoss2(int colorPrintLoss2) {
        this.colorPrintLoss2 = colorPrintLoss2;
    }

    @Basic
    @Column(name = "colorPrintPerPacketCost1")
    public int getColorPrintPerPacketCost1() {
        return colorPrintPerPacketCost1;
    }

    public void setColorPrintPerPacketCost1(int colorPrintPerPacketCost1) {
        this.colorPrintPerPacketCost1 = colorPrintPerPacketCost1;
    }

    @Basic
    @Column(name = "colorPrintPerPacketCost2")
    public int getColorPrintPerPacketCost2() {
        return colorPrintPerPacketCost2;
    }

    public void setColorPrintPerPacketCost2(int colorPrintPerPacketCost2) {
        this.colorPrintPerPacketCost2 = colorPrintPerPacketCost2;
    }

    @Basic
    @Column(name = "colorPrintBasicCost1")
    public int getColorPrintBasicCost1() {
        return colorPrintBasicCost1;
    }

    public void setColorPrintBasicCost1(int colorPrintBasicCost1) {
        this.colorPrintBasicCost1 = colorPrintBasicCost1;
    }

    @Basic
    @Column(name = "colorPrintBasicCost2")
    public int getColorPrintBasicCost2() {
        return colorPrintBasicCost2;
    }

    public void setColorPrintBasicCost2(int colorPrintBasicCost2) {
        this.colorPrintBasicCost2 = colorPrintBasicCost2;
    }

    @Basic
    @Column(name = "colorPrintThroughWage1")
    public BigDecimal getColorPrintThroughWage1() {
        return colorPrintThroughWage1;
    }

    public void setColorPrintThroughWage1(BigDecimal colorPrintThroughWage1) {
        this.colorPrintThroughWage1 = colorPrintThroughWage1;
    }

    @Basic
    @Column(name = "colorPrintThroughWage2")
    public BigDecimal getColorPrintThroughWage2() {
        return colorPrintThroughWage2;
    }

    public void setColorPrintThroughWage2(BigDecimal colorPrintThroughWage2) {
        this.colorPrintThroughWage2 = colorPrintThroughWage2;
    }

    @Basic
    @Column(name = "colorPrintSpecial1")
    public BigDecimal getColorPrintSpecial1() {
        return colorPrintSpecial1;
    }

    public void setColorPrintSpecial1(BigDecimal colorPrintSpecial1) {
        this.colorPrintSpecial1 = colorPrintSpecial1;
    }

    @Basic
    @Column(name = "colorPrintSpecial2")
    public BigDecimal getColorPrintSpecial2() {
        return colorPrintSpecial2;
    }

    public void setColorPrintSpecial2(BigDecimal colorPrintSpecial2) {
        this.colorPrintSpecial2 = colorPrintSpecial2;
    }

    @Basic
    @Column(name = "colorPrintTotalCost1")
    public int getColorPrintTotalCost1() {
        return colorPrintTotalCost1;
    }

    public void setColorPrintTotalCost1(int colorPrintTotalCost1) {
        this.colorPrintTotalCost1 = colorPrintTotalCost1;
    }

    @Basic
    @Column(name = "colorPrintTotalCost2")
    public int getColorPrintTotalCost2() {
        return colorPrintTotalCost2;
    }

    public void setColorPrintTotalCost2(int colorPrintTotalCost2) {
        this.colorPrintTotalCost2 = colorPrintTotalCost2;
    }

    @Basic
    @Column(name = "SurfaceTreatment_surfaceTreatmentID1")
    public int getSurfaceTreatmentSurfaceTreatmentId1() {
        return surfaceTreatmentSurfaceTreatmentId1;
    }

    public void setSurfaceTreatmentSurfaceTreatmentId1(int surfaceTreatmentSurfaceTreatmentId1) {
        this.surfaceTreatmentSurfaceTreatmentId1 = surfaceTreatmentSurfaceTreatmentId1;
    }

    @Basic
    @Column(name = "SurfaceTreatment_surfaceTreatmentID2")
    public int getSurfaceTreatmentSurfaceTreatmentId2() {
        return surfaceTreatmentSurfaceTreatmentId2;
    }

    public void setSurfaceTreatmentSurfaceTreatmentId2(int surfaceTreatmentSurfaceTreatmentId2) {
        this.surfaceTreatmentSurfaceTreatmentId2 = surfaceTreatmentSurfaceTreatmentId2;
    }

    @Basic
    @Column(name = "surfaceTreatmentBasicCost1")
    public String getSurfaceTreatmentBasicCost1() {
        return surfaceTreatmentBasicCost1;
    }

    public void setSurfaceTreatmentBasicCost1(String surfaceTreatmentBasicCost1) {
        this.surfaceTreatmentBasicCost1 = surfaceTreatmentBasicCost1;
    }

    @Basic
    @Column(name = "surfaceTreatmentBasicCost2")
    public String getSurfaceTreatmentBasicCost2() {
        return surfaceTreatmentBasicCost2;
    }

    public void setSurfaceTreatmentBasicCost2(String surfaceTreatmentBasicCost2) {
        this.surfaceTreatmentBasicCost2 = surfaceTreatmentBasicCost2;
    }

    @Basic
    @Column(name = "surfaceTreatmentThroughWage1")
    public String getSurfaceTreatmentThroughWage1() {
        return surfaceTreatmentThroughWage1;
    }

    public void setSurfaceTreatmentThroughWage1(String surfaceTreatmentThroughWage1) {
        this.surfaceTreatmentThroughWage1 = surfaceTreatmentThroughWage1;
    }

    @Basic
    @Column(name = "surfaceTreatmentThroughWage2")
    public String getSurfaceTreatmentThroughWage2() {
        return surfaceTreatmentThroughWage2;
    }

    public void setSurfaceTreatmentThroughWage2(String surfaceTreatmentThroughWage2) {
        this.surfaceTreatmentThroughWage2 = surfaceTreatmentThroughWage2;
    }

    @Basic
    @Column(name = "surfaceTreatmentTotalCost1")
    public int getSurfaceTreatmentTotalCost1() {
        return surfaceTreatmentTotalCost1;
    }

    public void setSurfaceTreatmentTotalCost1(int surfaceTreatmentTotalCost1) {
        this.surfaceTreatmentTotalCost1 = surfaceTreatmentTotalCost1;
    }

    @Basic
    @Column(name = "surfaceTreatmentTotalCost2")
    public int getSurfaceTreatmentTotalCost2() {
        return surfaceTreatmentTotalCost2;
    }

    public void setSurfaceTreatmentTotalCost2(int surfaceTreatmentTotalCost2) {
        this.surfaceTreatmentTotalCost2 = surfaceTreatmentTotalCost2;
    }

    @Basic
    @Column(name = "embossing")
    public byte getEmbossing() {
        return embossing;
    }

    public void setEmbossing(byte embossing) {
        this.embossing = embossing;
    }

    @Basic
    @Column(name = "embossingBasicCost")
    public int getEmbossingBasicCost() {
        return embossingBasicCost;
    }

    public void setEmbossingBasicCost(int embossingBasicCost) {
        this.embossingBasicCost = embossingBasicCost;
    }

    @Basic
    @Column(name = "embossingThroughWage")
    public BigDecimal getEmbossingThroughWage() {
        return embossingThroughWage;
    }

    public void setEmbossingThroughWage(BigDecimal embossingThroughWage) {
        this.embossingThroughWage = embossingThroughWage;
    }

    @Basic
    @Column(name = "embossingTotalCost")
    public int getEmbossingTotalCost() {
        return embossingTotalCost;
    }

    public void setEmbossingTotalCost(int embossingTotalCost) {
        this.embossingTotalCost = embossingTotalCost;
    }

    @Basic
    @Column(name = "laminationFlute")
    public String getLaminationFlute() {
        return laminationFlute;
    }

    public void setLaminationFlute(String laminationFlute) {
        this.laminationFlute = laminationFlute;
    }

    @Basic
    @Column(name = "laminationMediumBasicWeight")
    public int getLaminationMediumBasicWeight() {
        return laminationMediumBasicWeight;
    }

    public void setLaminationMediumBasicWeight(int laminationMediumBasicWeight) {
        this.laminationMediumBasicWeight = laminationMediumBasicWeight;
    }

    @Basic
    @Column(name = "laminationMediumThroughWage")
    public int getLaminationMediumThroughWage() {
        return laminationMediumThroughWage;
    }

    public void setLaminationMediumThroughWage(int laminationMediumThroughWage) {
        this.laminationMediumThroughWage = laminationMediumThroughWage;
    }

    @Basic
    @Column(name = "laminationBackBasicWeight")
    public int getLaminationBackBasicWeight() {
        return laminationBackBasicWeight;
    }

    public void setLaminationBackBasicWeight(int laminationBackBasicWeight) {
        this.laminationBackBasicWeight = laminationBackBasicWeight;
    }

    @Basic
    @Column(name = "laminationBackBasicThroughWage")
    public int getLaminationBackBasicThroughWage() {
        return laminationBackBasicThroughWage;
    }

    public void setLaminationBackBasicThroughWage(int laminationBackBasicThroughWage) {
        this.laminationBackBasicThroughWage = laminationBackBasicThroughWage;
    }

    @Basic
    @Column(name = "laminationNumber")
    public int getLaminationNumber() {
        return laminationNumber;
    }

    public void setLaminationNumber(int laminationNumber) {
        this.laminationNumber = laminationNumber;
    }

    @Basic
    @Column(name = "laminationWidth")
    public int getLaminationWidth() {
        return laminationWidth;
    }

    public void setLaminationWidth(int laminationWidth) {
        this.laminationWidth = laminationWidth;
    }

    @Basic
    @Column(name = "laminationCuttingFlow")
    public int getLaminationCuttingFlow() {
        return laminationCuttingFlow;
    }

    public void setLaminationCuttingFlow(int laminationCuttingFlow) {
        this.laminationCuttingFlow = laminationCuttingFlow;
    }

    @Basic
    @Column(name = "laminationUnitPrice")
    public BigDecimal getLaminationUnitPrice() {
        return laminationUnitPrice;
    }

    public void setLaminationUnitPrice(BigDecimal laminationUnitPrice) {
        this.laminationUnitPrice = laminationUnitPrice;
    }

    @Basic
    @Column(name = "laminationSheetCost")
    public BigDecimal getLaminationSheetCost() {
        return laminationSheetCost;
    }

    public void setLaminationSheetCost(BigDecimal laminationSheetCost) {
        this.laminationSheetCost = laminationSheetCost;
    }

    @Basic
    @Column(name = "laminationtotalCost")
    public BigDecimal getLaminationtotalCost() {
        return laminationtotalCost;
    }

    public void setLaminationtotalCost(BigDecimal laminationtotalCost) {
        this.laminationtotalCost = laminationtotalCost;
    }

    @Basic
    @Column(name = "Striking_strikingID")
    public int getStrikingStrikingId() {
        return strikingStrikingId;
    }

    public void setStrikingStrikingId(int strikingStrikingId) {
        this.strikingStrikingId = strikingStrikingId;
    }

    @Basic
    @Column(name = "strikingThroughNumber")
    public int getStrikingThroughNumber() {
        return strikingThroughNumber;
    }

    public void setStrikingThroughNumber(int strikingThroughNumber) {
        this.strikingThroughNumber = strikingThroughNumber;
    }

    @Basic
    @Column(name = "strikingWeight")
    public int getStrikingWeight() {
        return strikingWeight;
    }

    public void setStrikingWeight(int strikingWeight) {
        this.strikingWeight = strikingWeight;
    }

    @Basic
    @Column(name = "strikingLoss")
    public int getStrikingLoss() {
        return strikingLoss;
    }

    public void setStrikingLoss(int strikingLoss) {
        this.strikingLoss = strikingLoss;
    }

    @Basic
    @Column(name = "strikingBasicCost")
    public int getStrikingBasicCost() {
        return strikingBasicCost;
    }

    public void setStrikingBasicCost(int strikingBasicCost) {
        this.strikingBasicCost = strikingBasicCost;
    }

    @Basic
    @Column(name = "strikingThroughWage")
    public BigDecimal getStrikingThroughWage() {
        return strikingThroughWage;
    }

    public void setStrikingThroughWage(BigDecimal strikingThroughWage) {
        this.strikingThroughWage = strikingThroughWage;
    }

    @Basic
    @Column(name = "strikingTotalCost")
    public int getStrikingTotalCost() {
        return strikingTotalCost;
    }

    public void setStrikingTotalCost(int strikingTotalCost) {
        this.strikingTotalCost = strikingTotalCost;
    }

    @Basic
    @Column(name = "Stamping_stampingID")
    public int getStampingStampingId() {
        return stampingStampingId;
    }

    public void setStampingStampingId(int stampingStampingId) {
        this.stampingStampingId = stampingStampingId;
    }

    @Basic
    @Column(name = "stampingProcessingType")
    public String getStampingProcessingType() {
        return stampingProcessingType;
    }

    public void setStampingProcessingType(String stampingProcessingType) {
        this.stampingProcessingType = stampingProcessingType;
    }

    @Basic
    @Column(name = "stampingNumber")
    public int getStampingNumber() {
        return stampingNumber;
    }

    public void setStampingNumber(int stampingNumber) {
        this.stampingNumber = stampingNumber;
    }

    @Basic
    @Column(name = "stampingBasicCost")
    public int getStampingBasicCost() {
        return stampingBasicCost;
    }

    public void setStampingBasicCost(int stampingBasicCost) {
        this.stampingBasicCost = stampingBasicCost;
    }

    @Basic
    @Column(name = "stampingThroughWage")
    public BigDecimal getStampingThroughWage() {
        return stampingThroughWage;
    }

    public void setStampingThroughWage(BigDecimal stampingThroughWage) {
        this.stampingThroughWage = stampingThroughWage;
    }

    @Basic
    @Column(name = "stampingTotalCost")
    public int getStampingTotalCost() {
        return stampingTotalCost;
    }

    public void setStampingTotalCost(int stampingTotalCost) {
        this.stampingTotalCost = stampingTotalCost;
    }

    @Basic
    @Column(name = "windowMargin_windowMarginID")
    public int getWindowMarginWindowMarginId() {
        return windowMarginWindowMarginId;
    }

    public void setWindowMarginWindowMarginId(int windowMarginWindowMarginId) {
        this.windowMarginWindowMarginId = windowMarginWindowMarginId;
    }

    @Basic
    @Column(name = "windowVerticalSize")
    public int getWindowVerticalSize() {
        return windowVerticalSize;
    }

    public void setWindowVerticalSize(int windowVerticalSize) {
        this.windowVerticalSize = windowVerticalSize;
    }

    @Basic
    @Column(name = "windowHorizontalSize")
    public int getWindowHorizontalSize() {
        return windowHorizontalSize;
    }

    public void setWindowHorizontalSize(int windowHorizontalSize) {
        this.windowHorizontalSize = windowHorizontalSize;
    }

    @Basic
    @Column(name = "windowMaterialFee")
    public BigDecimal getWindowMaterialFee() {
        return windowMaterialFee;
    }

    public void setWindowMaterialFee(BigDecimal windowMaterialFee) {
        this.windowMaterialFee = windowMaterialFee;
    }

    @Basic
    @Column(name = "windowTotalCost")
    public int getWindowTotalCost() {
        return windowTotalCost;
    }

    public void setWindowTotalCost(int windowTotalCost) {
        this.windowTotalCost = windowTotalCost;
    }

    @Basic
    @Column(name = "Paste_pasteID")
    public int getPastePasteId() {
        return pastePasteId;
    }

    public void setPastePasteId(int pastePasteId) {
        this.pastePasteId = pastePasteId;
    }

    @Basic
    @Column(name = "pasteForm")
    public String getPasteForm() {
        return pasteForm;
    }

    public void setPasteForm(String pasteForm) {
        this.pasteForm = pasteForm;
    }

    @Basic
    @Column(name = "pasteBlankSize")
    public int getPasteBlankSize() {
        return pasteBlankSize;
    }

    public void setPasteBlankSize(int pasteBlankSize) {
        this.pasteBlankSize = pasteBlankSize;
    }

    @Basic
    @Column(name = "pasteSpecialForm")
    public byte getPasteSpecialForm() {
        return pasteSpecialForm;
    }

    public void setPasteSpecialForm(byte pasteSpecialForm) {
        this.pasteSpecialForm = pasteSpecialForm;
    }

    @Basic
    @Column(name = "pasteLoss")
    public int getPasteLoss() {
        return pasteLoss;
    }

    public void setPasteLoss(int pasteLoss) {
        this.pasteLoss = pasteLoss;
    }

    @Basic
    @Column(name = "pasteBasicCost")
    public int getPasteBasicCost() {
        return pasteBasicCost;
    }

    public void setPasteBasicCost(int pasteBasicCost) {
        this.pasteBasicCost = pasteBasicCost;
    }

    @Basic
    @Column(name = "pasteThroughWage")
    public BigDecimal getPasteThroughWage() {
        return pasteThroughWage;
    }

    public void setPasteThroughWage(BigDecimal pasteThroughWage) {
        this.pasteThroughWage = pasteThroughWage;
    }

    @Basic
    @Column(name = "pasteTotalCost")
    public int getPasteTotalCost() {
        return pasteTotalCost;
    }

    public void setPasteTotalCost(int pasteTotalCost) {
        this.pasteTotalCost = pasteTotalCost;
    }

    @Basic
    @Column(name = "otherCost1")
    public Integer getOtherCost1() {
        return otherCost1;
    }

    public void setOtherCost1(Integer otherCost1) {
        this.otherCost1 = otherCost1;
    }

    @Basic
    @Column(name = "otherCost2")
    public Integer getOtherCost2() {
        return otherCost2;
    }

    public void setOtherCost2(Integer otherCost2) {
        this.otherCost2 = otherCost2;
    }

    @Basic
    @Column(name = "otherCost3")
    public Integer getOtherCost3() {
        return otherCost3;
    }

    public void setOtherCost3(Integer otherCost3) {
        this.otherCost3 = otherCost3;
    }

    @Basic
    @Column(name = "subTotal1")
    public int getSubTotal1() {
        return subTotal1;
    }

    public void setSubTotal1(int subTotal1) {
        this.subTotal1 = subTotal1;
    }

    @Basic
    @Column(name = "packingFee")
    public Integer getPackingFee() {
        return packingFee;
    }

    public void setPackingFee(Integer packingFee) {
        this.packingFee = packingFee;
    }

    @Basic
    @Column(name = "Packing_packingID")
    public int getPackingPackingId() {
        return packingPackingId;
    }

    public void setPackingPackingId(int packingPackingId) {
        this.packingPackingId = packingPackingId;
    }

    @Basic
    @Column(name = "subTotal2")
    public int getSubTotal2() {
        return subTotal2;
    }

    public void setSubTotal2(int subTotal2) {
        this.subTotal2 = subTotal2;
    }

    @Basic
    @Column(name = "managementCost")
    public int getManagementCost() {
        return managementCost;
    }

    public void setManagementCost(int managementCost) {
        this.managementCost = managementCost;
    }

    @Basic
    @Column(name = "fare")
    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    @Basic
    @Column(name = "estimatedSum")
    public int getEstimatedSum() {
        return estimatedSum;
    }

    public void setEstimatedSum(int estimatedSum) {
        this.estimatedSum = estimatedSum;
    }

    @Basic
    @Column(name = "estimatedUnitPrice")
    public int getEstimatedUnitPrice() {
        return estimatedUnitPrice;
    }

    public void setEstimatedUnitPrice(int estimatedUnitPrice) {
        this.estimatedUnitPrice = estimatedUnitPrice;
    }

    @Basic
    @Column(name = "submittedSum")
    public int getSubmittedSum() {
        return submittedSum;
    }

    public void setSubmittedSum(int submittedSum) {
        this.submittedSum = submittedSum;
    }

    @Basic
    @Column(name = "submittedUnitPrice")
    public int getSubmittedUnitPrice() {
        return submittedUnitPrice;
    }

    public void setSubmittedUnitPrice(int submittedUnitPrice) {
        this.submittedUnitPrice = submittedUnitPrice;
    }

    @Basic
    @Column(name = "Color_colorID")
    public int getColorColorId() {
        return colorColorId;
    }

    public void setColorColorId(int colorColorId) {
        this.colorColorId = colorColorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (productId != that.productId) return false;
        if (dealDealId != that.dealDealId) return false;
        if (lotInput != that.lotInput) return false;
        if (throughInput != that.throughInput) return false;
        if (paperPaperId != that.paperPaperId) return false;
        if (takenNumber != that.takenNumber) return false;
        if (impositionNumber != that.impositionNumber) return false;
        if (paperActualWeight != that.paperActualWeight) return false;
        if (paperTotalCost != that.paperTotalCost) return false;
        if (colorColorId2 != that.colorColorId2) return false;
        if (colorPlateCost1 != that.colorPlateCost1) return false;
        if (colorPlateCost2 != that.colorPlateCost2) return false;
        if (colorPrintLoss1 != that.colorPrintLoss1) return false;
        if (colorPrintLoss2 != that.colorPrintLoss2) return false;
        if (colorPrintPerPacketCost1 != that.colorPrintPerPacketCost1) return false;
        if (colorPrintPerPacketCost2 != that.colorPrintPerPacketCost2) return false;
        if (colorPrintBasicCost1 != that.colorPrintBasicCost1) return false;
        if (colorPrintBasicCost2 != that.colorPrintBasicCost2) return false;
        if (colorPrintTotalCost1 != that.colorPrintTotalCost1) return false;
        if (colorPrintTotalCost2 != that.colorPrintTotalCost2) return false;
        if (surfaceTreatmentSurfaceTreatmentId1 != that.surfaceTreatmentSurfaceTreatmentId1) return false;
        if (surfaceTreatmentSurfaceTreatmentId2 != that.surfaceTreatmentSurfaceTreatmentId2) return false;
        if (surfaceTreatmentTotalCost1 != that.surfaceTreatmentTotalCost1) return false;
        if (surfaceTreatmentTotalCost2 != that.surfaceTreatmentTotalCost2) return false;
        if (embossing != that.embossing) return false;
        if (embossingBasicCost != that.embossingBasicCost) return false;
        if (embossingTotalCost != that.embossingTotalCost) return false;
        if (laminationMediumBasicWeight != that.laminationMediumBasicWeight) return false;
        if (laminationMediumThroughWage != that.laminationMediumThroughWage) return false;
        if (laminationBackBasicWeight != that.laminationBackBasicWeight) return false;
        if (laminationBackBasicThroughWage != that.laminationBackBasicThroughWage) return false;
        if (laminationNumber != that.laminationNumber) return false;
        if (laminationWidth != that.laminationWidth) return false;
        if (laminationCuttingFlow != that.laminationCuttingFlow) return false;
        if (strikingStrikingId != that.strikingStrikingId) return false;
        if (strikingThroughNumber != that.strikingThroughNumber) return false;
        if (strikingWeight != that.strikingWeight) return false;
        if (strikingLoss != that.strikingLoss) return false;
        if (strikingBasicCost != that.strikingBasicCost) return false;
        if (strikingTotalCost != that.strikingTotalCost) return false;
        if (stampingStampingId != that.stampingStampingId) return false;
        if (stampingNumber != that.stampingNumber) return false;
        if (stampingBasicCost != that.stampingBasicCost) return false;
        if (stampingTotalCost != that.stampingTotalCost) return false;
        if (windowMarginWindowMarginId != that.windowMarginWindowMarginId) return false;
        if (windowVerticalSize != that.windowVerticalSize) return false;
        if (windowHorizontalSize != that.windowHorizontalSize) return false;
        if (windowTotalCost != that.windowTotalCost) return false;
        if (pastePasteId != that.pastePasteId) return false;
        if (pasteBlankSize != that.pasteBlankSize) return false;
        if (pasteSpecialForm != that.pasteSpecialForm) return false;
        if (pasteLoss != that.pasteLoss) return false;
        if (pasteBasicCost != that.pasteBasicCost) return false;
        if (pasteTotalCost != that.pasteTotalCost) return false;
        if (subTotal1 != that.subTotal1) return false;
        if (packingPackingId != that.packingPackingId) return false;
        if (subTotal2 != that.subTotal2) return false;
        if (managementCost != that.managementCost) return false;
        if (fare != that.fare) return false;
        if (estimatedSum != that.estimatedSum) return false;
        if (estimatedUnitPrice != that.estimatedUnitPrice) return false;
        if (submittedSum != that.submittedSum) return false;
        if (submittedUnitPrice != that.submittedUnitPrice) return false;
        if (colorColorId != that.colorColorId) return false;
        if (inspection != null ? !inspection.equals(that.inspection) : that.inspection != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (verticalPageSize != null ? !verticalPageSize.equals(that.verticalPageSize) : that.verticalPageSize != null)
            return false;
        if (horizontalPageSize != null ? !horizontalPageSize.equals(that.horizontalPageSize) : that.horizontalPageSize != null)
            return false;
        if (cutVerticalPageSize != null ? !cutVerticalPageSize.equals(that.cutVerticalPageSize) : that.cutVerticalPageSize != null)
            return false;
        if (cutHorizontalPageSize != null ? !cutHorizontalPageSize.equals(that.cutHorizontalPageSize) : that.cutHorizontalPageSize != null)
            return false;
        if (blankVerticalPageSize != null ? !blankVerticalPageSize.equals(that.blankVerticalPageSize) : that.blankVerticalPageSize != null)
            return false;
        if (blankHorizontalPageSize != null ? !blankHorizontalPageSize.equals(that.blankHorizontalPageSize) : that.blankHorizontalPageSize != null)
            return false;
        if (paperUnitPrice != null ? !paperUnitPrice.equals(that.paperUnitPrice) : that.paperUnitPrice != null)
            return false;
        if (specialColor1 != null ? !specialColor1.equals(that.specialColor1) : that.specialColor1 != null)
            return false;
        if (specialColor2 != null ? !specialColor2.equals(that.specialColor2) : that.specialColor2 != null)
            return false;
        if (colorPrintThroughWage1 != null ? !colorPrintThroughWage1.equals(that.colorPrintThroughWage1) : that.colorPrintThroughWage1 != null)
            return false;
        if (colorPrintThroughWage2 != null ? !colorPrintThroughWage2.equals(that.colorPrintThroughWage2) : that.colorPrintThroughWage2 != null)
            return false;
        if (colorPrintSpecial1 != null ? !colorPrintSpecial1.equals(that.colorPrintSpecial1) : that.colorPrintSpecial1 != null)
            return false;
        if (colorPrintSpecial2 != null ? !colorPrintSpecial2.equals(that.colorPrintSpecial2) : that.colorPrintSpecial2 != null)
            return false;
        if (surfaceTreatmentBasicCost1 != null ? !surfaceTreatmentBasicCost1.equals(that.surfaceTreatmentBasicCost1) : that.surfaceTreatmentBasicCost1 != null)
            return false;
        if (surfaceTreatmentBasicCost2 != null ? !surfaceTreatmentBasicCost2.equals(that.surfaceTreatmentBasicCost2) : that.surfaceTreatmentBasicCost2 != null)
            return false;
        if (surfaceTreatmentThroughWage1 != null ? !surfaceTreatmentThroughWage1.equals(that.surfaceTreatmentThroughWage1) : that.surfaceTreatmentThroughWage1 != null)
            return false;
        if (surfaceTreatmentThroughWage2 != null ? !surfaceTreatmentThroughWage2.equals(that.surfaceTreatmentThroughWage2) : that.surfaceTreatmentThroughWage2 != null)
            return false;
        if (embossingThroughWage != null ? !embossingThroughWage.equals(that.embossingThroughWage) : that.embossingThroughWage != null)
            return false;
        if (laminationFlute != null ? !laminationFlute.equals(that.laminationFlute) : that.laminationFlute != null)
            return false;
        if (laminationUnitPrice != null ? !laminationUnitPrice.equals(that.laminationUnitPrice) : that.laminationUnitPrice != null)
            return false;
        if (laminationSheetCost != null ? !laminationSheetCost.equals(that.laminationSheetCost) : that.laminationSheetCost != null)
            return false;
        if (laminationtotalCost != null ? !laminationtotalCost.equals(that.laminationtotalCost) : that.laminationtotalCost != null)
            return false;
        if (strikingThroughWage != null ? !strikingThroughWage.equals(that.strikingThroughWage) : that.strikingThroughWage != null)
            return false;
        if (stampingProcessingType != null ? !stampingProcessingType.equals(that.stampingProcessingType) : that.stampingProcessingType != null)
            return false;
        if (stampingThroughWage != null ? !stampingThroughWage.equals(that.stampingThroughWage) : that.stampingThroughWage != null)
            return false;
        if (windowMaterialFee != null ? !windowMaterialFee.equals(that.windowMaterialFee) : that.windowMaterialFee != null)
            return false;
        if (pasteForm != null ? !pasteForm.equals(that.pasteForm) : that.pasteForm != null) return false;
        if (pasteThroughWage != null ? !pasteThroughWage.equals(that.pasteThroughWage) : that.pasteThroughWage != null)
            return false;
        if (otherCost1 != null ? !otherCost1.equals(that.otherCost1) : that.otherCost1 != null) return false;
        if (otherCost2 != null ? !otherCost2.equals(that.otherCost2) : that.otherCost2 != null) return false;
        if (otherCost3 != null ? !otherCost3.equals(that.otherCost3) : that.otherCost3 != null) return false;
        if (packingFee != null ? !packingFee.equals(that.packingFee) : that.packingFee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + dealDealId;
        result = 31 * result + (inspection != null ? inspection.hashCode() : 0);
        result = 31 * result + lotInput;
        result = 31 * result + throughInput;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + paperPaperId;
        result = 31 * result + (verticalPageSize != null ? verticalPageSize.hashCode() : 0);
        result = 31 * result + (horizontalPageSize != null ? horizontalPageSize.hashCode() : 0);
        result = 31 * result + (cutVerticalPageSize != null ? cutVerticalPageSize.hashCode() : 0);
        result = 31 * result + (cutHorizontalPageSize != null ? cutHorizontalPageSize.hashCode() : 0);
        result = 31 * result + (blankVerticalPageSize != null ? blankVerticalPageSize.hashCode() : 0);
        result = 31 * result + (blankHorizontalPageSize != null ? blankHorizontalPageSize.hashCode() : 0);
        result = 31 * result + takenNumber;
        result = 31 * result + impositionNumber;
        result = 31 * result + paperActualWeight;
        result = 31 * result + (paperUnitPrice != null ? paperUnitPrice.hashCode() : 0);
        result = 31 * result + paperTotalCost;
        result = 31 * result + (specialColor1 != null ? specialColor1.hashCode() : 0);
        result = 31 * result + colorColorId2;
        result = 31 * result + (specialColor2 != null ? specialColor2.hashCode() : 0);
        result = 31 * result + colorPlateCost1;
        result = 31 * result + colorPlateCost2;
        result = 31 * result + colorPrintLoss1;
        result = 31 * result + colorPrintLoss2;
        result = 31 * result + colorPrintPerPacketCost1;
        result = 31 * result + colorPrintPerPacketCost2;
        result = 31 * result + colorPrintBasicCost1;
        result = 31 * result + colorPrintBasicCost2;
        result = 31 * result + (colorPrintThroughWage1 != null ? colorPrintThroughWage1.hashCode() : 0);
        result = 31 * result + (colorPrintThroughWage2 != null ? colorPrintThroughWage2.hashCode() : 0);
        result = 31 * result + (colorPrintSpecial1 != null ? colorPrintSpecial1.hashCode() : 0);
        result = 31 * result + (colorPrintSpecial2 != null ? colorPrintSpecial2.hashCode() : 0);
        result = 31 * result + colorPrintTotalCost1;
        result = 31 * result + colorPrintTotalCost2;
        result = 31 * result + surfaceTreatmentSurfaceTreatmentId1;
        result = 31 * result + surfaceTreatmentSurfaceTreatmentId2;
        result = 31 * result + (surfaceTreatmentBasicCost1 != null ? surfaceTreatmentBasicCost1.hashCode() : 0);
        result = 31 * result + (surfaceTreatmentBasicCost2 != null ? surfaceTreatmentBasicCost2.hashCode() : 0);
        result = 31 * result + (surfaceTreatmentThroughWage1 != null ? surfaceTreatmentThroughWage1.hashCode() : 0);
        result = 31 * result + (surfaceTreatmentThroughWage2 != null ? surfaceTreatmentThroughWage2.hashCode() : 0);
        result = 31 * result + surfaceTreatmentTotalCost1;
        result = 31 * result + surfaceTreatmentTotalCost2;
        result = 31 * result + (int) embossing;
        result = 31 * result + embossingBasicCost;
        result = 31 * result + (embossingThroughWage != null ? embossingThroughWage.hashCode() : 0);
        result = 31 * result + embossingTotalCost;
        result = 31 * result + (laminationFlute != null ? laminationFlute.hashCode() : 0);
        result = 31 * result + laminationMediumBasicWeight;
        result = 31 * result + laminationMediumThroughWage;
        result = 31 * result + laminationBackBasicWeight;
        result = 31 * result + laminationBackBasicThroughWage;
        result = 31 * result + laminationNumber;
        result = 31 * result + laminationWidth;
        result = 31 * result + laminationCuttingFlow;
        result = 31 * result + (laminationUnitPrice != null ? laminationUnitPrice.hashCode() : 0);
        result = 31 * result + (laminationSheetCost != null ? laminationSheetCost.hashCode() : 0);
        result = 31 * result + (laminationtotalCost != null ? laminationtotalCost.hashCode() : 0);
        result = 31 * result + strikingStrikingId;
        result = 31 * result + strikingThroughNumber;
        result = 31 * result + strikingWeight;
        result = 31 * result + strikingLoss;
        result = 31 * result + strikingBasicCost;
        result = 31 * result + (strikingThroughWage != null ? strikingThroughWage.hashCode() : 0);
        result = 31 * result + strikingTotalCost;
        result = 31 * result + stampingStampingId;
        result = 31 * result + (stampingProcessingType != null ? stampingProcessingType.hashCode() : 0);
        result = 31 * result + stampingNumber;
        result = 31 * result + stampingBasicCost;
        result = 31 * result + (stampingThroughWage != null ? stampingThroughWage.hashCode() : 0);
        result = 31 * result + stampingTotalCost;
        result = 31 * result + windowMarginWindowMarginId;
        result = 31 * result + windowVerticalSize;
        result = 31 * result + windowHorizontalSize;
        result = 31 * result + (windowMaterialFee != null ? windowMaterialFee.hashCode() : 0);
        result = 31 * result + windowTotalCost;
        result = 31 * result + pastePasteId;
        result = 31 * result + (pasteForm != null ? pasteForm.hashCode() : 0);
        result = 31 * result + pasteBlankSize;
        result = 31 * result + (int) pasteSpecialForm;
        result = 31 * result + pasteLoss;
        result = 31 * result + pasteBasicCost;
        result = 31 * result + (pasteThroughWage != null ? pasteThroughWage.hashCode() : 0);
        result = 31 * result + pasteTotalCost;
        result = 31 * result + (otherCost1 != null ? otherCost1.hashCode() : 0);
        result = 31 * result + (otherCost2 != null ? otherCost2.hashCode() : 0);
        result = 31 * result + (otherCost3 != null ? otherCost3.hashCode() : 0);
        result = 31 * result + subTotal1;
        result = 31 * result + (packingFee != null ? packingFee.hashCode() : 0);
        result = 31 * result + packingPackingId;
        result = 31 * result + subTotal2;
        result = 31 * result + managementCost;
        result = 31 * result + fare;
        result = 31 * result + estimatedSum;
        result = 31 * result + estimatedUnitPrice;
        result = 31 * result + submittedSum;
        result = 31 * result + submittedUnitPrice;
        result = 31 * result + colorColorId;
        return result;
    }
}
