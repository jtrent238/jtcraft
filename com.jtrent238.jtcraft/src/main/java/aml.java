/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aml
/*     */   extends alt
/*     */ {
/*  18 */   public static final String[][] N = { { "leaves_oak", "leaves_spruce", "leaves_birch", "leaves_jungle" }, { "leaves_oak_opaque", "leaves_spruce_opaque", "leaves_birch_opaque", "leaves_jungle_opaque" } };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  25 */   public static final String[] O = { "oak", "spruce", "birch", "jungle" };
/*     */   
/*     */ 
/*     */ 
/*     */   public int i(int paramInt)
/*     */   {
/*  31 */     if ((paramInt & 0x3) == 1) {
/*  32 */       return agx.a();
/*     */     }
/*  34 */     if ((paramInt & 0x3) == 2) {
/*  35 */       return agx.b();
/*     */     }
/*     */     
/*  38 */     return super.i(paramInt);
/*     */   }
/*     */   
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  45 */     if ((i & 0x3) == 1) {
/*  46 */       return agx.a();
/*     */     }
/*  48 */     if ((i & 0x3) == 2) {
/*  49 */       return agx.b();
/*     */     }
/*     */     
/*  52 */     return super.d(paramahl, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected void c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  57 */     if (((paramInt4 & 0x3) == 0) && (paramahb.s.nextInt(paramInt5) == 0)) {
/*  58 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(ade.e, 1, 0));
/*     */     }
/*     */   }
/*     */   
/*     */   protected int b(int paramInt)
/*     */   {
/*  64 */     int i = super.b(paramInt);
/*     */     
/*  66 */     if ((paramInt & 0x3) == 3) {
/*  67 */       i = 40;
/*     */     }
/*     */     
/*  70 */     return i;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  75 */     if ((paramInt2 & 0x3) == 1) {
/*  76 */       return this.M[this.b][1];
/*     */     }
/*  78 */     if ((paramInt2 & 0x3) == 3) {
/*  79 */       return this.M[this.b][3];
/*     */     }
/*  81 */     if ((paramInt2 & 0x3) == 2) {
/*  82 */       return this.M[this.b][2];
/*     */     }
/*  84 */     return this.M[this.b][0];
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/*  89 */     paramList.add(new add(paramadb, 1, 0));
/*  90 */     paramList.add(new add(paramadb, 1, 1));
/*  91 */     paramList.add(new add(paramadb, 1, 2));
/*  92 */     paramList.add(new add(paramadb, 1, 3));
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  97 */     for (int i = 0; i < N.length; i++) {
/*  98 */       this.M[i] = new rf[N[i].length];
/*     */       
/* 100 */       for (int j = 0; j < N[i].length; j++) {
/* 101 */         this.M[i][j] = paramrg.a(N[i][j]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public String[] e()
/*     */   {
/* 108 */     return O;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */