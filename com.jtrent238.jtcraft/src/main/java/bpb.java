/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class bpb
/*     */   extends bok
/*     */ {
/*  15 */   private static final bqx a = new bqx("textures/entity/witch.png");
/*     */   private final bim f;
/*     */   
/*     */   public bpb() {
/*  19 */     super(new bim(0.0F), 0.5F);
/*     */     
/*  21 */     this.f = ((bim)this.i);
/*     */   }
/*     */   
/*     */   public void a(yp paramyp, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  26 */     add localadd = paramyp.be();
/*     */     
/*  28 */     this.f.g = (localadd != null);
/*  29 */     super.a(paramyp, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*     */   }
/*     */   
/*     */   protected bqx a(yp paramyp)
/*     */   {
/*  34 */     return a;
/*     */   }
/*     */   
/*     */   protected void a(yp paramyp, float paramFloat)
/*     */   {
/*  39 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*     */     
/*  41 */     super.c(paramyp, paramFloat);
/*     */     
/*  43 */     add localadd = paramyp.be();
/*     */     
/*  45 */     if (localadd != null) {
/*  46 */       GL11.glPushMatrix();
/*     */       float f1;
/*  48 */       if (this.i.s) {
/*  49 */         f1 = 0.5F;
/*  50 */         GL11.glTranslatef(0.0F, 0.625F, 0.0F);
/*  51 */         GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
/*  52 */         GL11.glScalef(f1, f1, f1);
/*     */       }
/*     */       
/*  55 */       this.f.f.c(0.0625F);
/*  56 */       GL11.glTranslatef(-0.0625F, 0.53125F, 0.21875F);
/*     */       
/*  58 */       if (((localadd.b() instanceof abh)) && (blm.a(aji.a(localadd.b()).b()))) {
/*  59 */         f1 = 0.5F;
/*  60 */         GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
/*  61 */         f1 *= 0.75F;
/*  62 */         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/*  63 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*  64 */         GL11.glScalef(f1, -f1, f1);
/*  65 */       } else if (localadd.b() == ade.f) {
/*  66 */         f1 = 0.625F;
/*  67 */         GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
/*  68 */         GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
/*  69 */         GL11.glScalef(f1, -f1, f1);
/*  70 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/*  71 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*  72 */       } else if (localadd.b().f()) {
/*  73 */         f1 = 0.625F;
/*  74 */         if (localadd.b().g()) {
/*  75 */           GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/*  76 */           GL11.glTranslatef(0.0F, -0.125F, 0.0F);
/*     */         }
/*  78 */         d();
/*  79 */         GL11.glScalef(f1, -f1, f1);
/*  80 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/*  81 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       } else {
/*  83 */         f1 = 0.375F;
/*  84 */         GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
/*  85 */         GL11.glScalef(f1, f1, f1);
/*  86 */         GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
/*  87 */         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/*  88 */         GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
/*     */       }
/*     */       
/*  91 */       GL11.glRotatef(-15.0F, 1.0F, 0.0F, 0.0F);
/*  92 */       GL11.glRotatef(40.0F, 0.0F, 0.0F, 1.0F);
/*     */       
/*  94 */       this.b.f.a(paramyp, localadd, 0);
/*  95 */       if (localadd.b().b()) {
/*  96 */         this.b.f.a(paramyp, localadd, 1);
/*     */       }
/*  98 */       GL11.glPopMatrix();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void d() {
/* 103 */     GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
/*     */   }
/*     */   
/*     */   protected void b(yp paramyp, float paramFloat)
/*     */   {
/* 108 */     float f1 = 0.9375F;
/* 109 */     GL11.glScalef(f1, f1, f1);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */