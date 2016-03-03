/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pb
/*    */   extends ph
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final pb c;
/*    */   private final String k;
/*    */   private pd l;
/*    */   public final add d;
/*    */   private boolean m;
/*    */   
/*    */   public pb(String paramString1, String paramString2, int paramInt1, int paramInt2, adb paramadb, pb parampb)
/*    */   {
/* 19 */     this(paramString1, paramString2, paramInt1, paramInt2, new add(paramadb), parampb);
/*    */   }
/*    */   
/*    */   public pb(String paramString1, String paramString2, int paramInt1, int paramInt2, aji paramaji, pb parampb) {
/* 23 */     this(paramString1, paramString2, paramInt1, paramInt2, new add(paramaji), parampb);
/*    */   }
/*    */   
/*    */   public pb(String paramString1, String paramString2, int paramInt1, int paramInt2, add paramadd, pb parampb) {
/* 27 */     super(paramString1, new fr("achievement." + paramString2, new Object[0]));
/* 28 */     this.d = paramadd;
/*    */     
/* 30 */     this.k = ("achievement." + paramString2 + ".desc");
/* 31 */     this.a = paramInt1;
/* 32 */     this.b = paramInt2;
/*    */     
/* 34 */     if (paramInt1 < pc.a) pc.a = paramInt1;
/* 35 */     if (paramInt2 < pc.b) pc.b = paramInt2;
/* 36 */     if (paramInt1 > pc.c) pc.c = paramInt1;
/* 37 */     if (paramInt2 > pc.d) pc.d = paramInt2;
/* 38 */     this.c = parampb;
/*    */   }
/*    */   
/*    */   public pb a()
/*    */   {
/* 43 */     this.f = true;
/* 44 */     return this;
/*    */   }
/*    */   
/*    */   public pb b() {
/* 48 */     this.m = true;
/* 49 */     return this;
/*    */   }
/*    */   
/*    */   public pb c()
/*    */   {
/* 54 */     super.h();
/*    */     
/* 56 */     pc.e.add(this);
/*    */     
/* 58 */     return this;
/*    */   }
/*    */   
/*    */   public boolean d()
/*    */   {
/* 63 */     return true;
/*    */   }
/*    */   
/*    */   public fj e()
/*    */   {
/* 68 */     fj localfj = super.e();
/* 69 */     localfj.b().a(g() ? a.f : a.k);
/* 70 */     return localfj;
/*    */   }
/*    */   
/*    */   public pb a(Class paramClass)
/*    */   {
/* 75 */     return (pb)super.b(paramClass);
/*    */   }
/*    */   
/*    */   public String f() {
/* 79 */     if (this.l != null) {
/* 80 */       return this.l.a(dd.a(this.k));
/*    */     }
/* 82 */     return dd.a(this.k);
/*    */   }
/*    */   
/*    */   public pb a(pd parampd) {
/* 86 */     this.l = parampd;
/* 87 */     return this;
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 91 */     return this.m;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */