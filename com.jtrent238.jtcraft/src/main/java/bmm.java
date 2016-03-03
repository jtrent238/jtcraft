/*     */ import java.util.Calendar;
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
/*     */ public class bmm
/*     */   extends bml
/*     */ {
/*  16 */   private static final bqx b = new bqx("textures/entity/chest/trapped_double.png");
/*  17 */   private static final bqx c = new bqx("textures/entity/chest/christmas_double.png");
/*  18 */   private static final bqx d = new bqx("textures/entity/chest/normal_double.png");
/*  19 */   private static final bqx e = new bqx("textures/entity/chest/trapped.png");
/*  20 */   private static final bqx f = new bqx("textures/entity/chest/christmas.png");
/*  21 */   private static final bqx g = new bqx("textures/entity/chest/normal.png");
/*     */   
/*  23 */   private bhg h = new bhg();
/*  24 */   private bhg i = new bhn();
/*     */   
/*     */   private boolean j;
/*     */   
/*     */   public bmm()
/*     */   {
/*  30 */     Calendar localCalendar = Calendar.getInstance();
/*  31 */     if ((localCalendar.get(2) + 1 == 12) && (localCalendar.get(5) >= 24) && (localCalendar.get(5) <= 26)) {
/*  32 */       this.j = true;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aow paramaow, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*     */   {
/*     */     int k;
/*     */     Object localObject;
/*  40 */     if (!paramaow.o()) {
/*  41 */       k = 0;
/*     */     } else {
/*  43 */       localObject = paramaow.q();
/*  44 */       k = paramaow.p();
/*     */       
/*  46 */       if (((localObject instanceof ajx)) && (k == 0)) {
/*  47 */         ((ajx)localObject).e(paramaow.w(), paramaow.c, paramaow.d, paramaow.e);
/*  48 */         k = paramaow.p();
/*     */       }
/*     */       
/*  51 */       paramaow.i();
/*     */     }
/*     */     
/*  54 */     if ((paramaow.i != null) || (paramaow.k != null)) { return;
/*     */     }
/*     */     
/*  57 */     if ((paramaow.j != null) || (paramaow.l != null)) {
/*  58 */       localObject = this.i;
/*     */       
/*  60 */       if (paramaow.j() == 1) {
/*  61 */         a(b);
/*  62 */       } else if (this.j) {
/*  63 */         a(c);
/*     */       } else {
/*  65 */         a(d);
/*     */       }
/*     */     } else {
/*  68 */       localObject = this.h;
/*  69 */       if (paramaow.j() == 1) {
/*  70 */         a(e);
/*  71 */       } else if (this.j) {
/*  72 */         a(f);
/*     */       } else {
/*  74 */         a(g);
/*     */       }
/*     */     }
/*     */     
/*  78 */     GL11.glPushMatrix();
/*  79 */     GL11.glEnable(32826);
/*  80 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  81 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2 + 1.0F, (float)paramDouble3 + 1.0F);
/*  82 */     GL11.glScalef(1.0F, -1.0F, -1.0F);
/*     */     
/*  84 */     GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*  85 */     int m = 0;
/*  86 */     if (k == 2) m = 180;
/*  87 */     if (k == 3) m = 0;
/*  88 */     if (k == 4) m = 90;
/*  89 */     if (k == 5) { m = -90;
/*     */     }
/*  91 */     if ((k == 2) && (paramaow.j != null)) {
/*  92 */       GL11.glTranslatef(1.0F, 0.0F, 0.0F);
/*     */     }
/*  94 */     if ((k == 5) && (paramaow.l != null)) {
/*  95 */       GL11.glTranslatef(0.0F, 0.0F, -1.0F);
/*     */     }
/*  97 */     GL11.glRotatef(m, 0.0F, 1.0F, 0.0F);
/*  98 */     GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/*     */     
/* 100 */     float f1 = paramaow.n + (paramaow.m - paramaow.n) * paramFloat;
/* 101 */     float f2; if (paramaow.i != null) {
/* 102 */       f2 = paramaow.i.n + (paramaow.i.m - paramaow.i.n) * paramFloat;
/* 103 */       if (f2 > f1) f1 = f2;
/*     */     }
/* 105 */     if (paramaow.k != null) {
/* 106 */       f2 = paramaow.k.n + (paramaow.k.m - paramaow.k.n) * paramFloat;
/* 107 */       if (f2 > f1) { f1 = f2;
/*     */       }
/*     */     }
/* 110 */     f1 = 1.0F - f1;
/* 111 */     f1 = 1.0F - f1 * f1 * f1;
/*     */     
/* 113 */     ((bhg)localObject).a.f = (-(f1 * 3.1415927F / 2.0F));
/* 114 */     ((bhg)localObject).a();
/* 115 */     GL11.glDisable(32826);
/* 116 */     GL11.glPopMatrix();
/* 117 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */