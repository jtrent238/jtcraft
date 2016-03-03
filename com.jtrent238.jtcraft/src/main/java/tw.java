/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tw
/*    */   extends ui
/*    */ {
/* 14 */   public final sj a = new tx(this);
/*    */   
/*    */   private td b;
/*    */   
/*    */   private double c;
/*    */   
/*    */   private double d;
/*    */   
/*    */   private sa e;
/*    */   private float f;
/*    */   private ayf g;
/*    */   private vv h;
/*    */   private Class i;
/*    */   
/*    */   public tw(td paramtd, Class paramClass, float paramFloat, double paramDouble1, double paramDouble2)
/*    */   {
/* 30 */     this.b = paramtd;
/* 31 */     this.i = paramClass;
/* 32 */     this.f = paramFloat;
/* 33 */     this.c = paramDouble1;
/* 34 */     this.d = paramDouble2;
/* 35 */     this.h = paramtd.m();
/* 36 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 41 */     if (this.i == yz.class) {
/* 42 */       if (((this.b instanceof tg)) && (((tg)this.b).bZ())) return false;
/* 43 */       this.e = this.b.o.a(this.b, this.f);
/* 44 */       if (this.e == null) return false;
/*    */     } else {
/* 46 */       localObject = this.b.o.a(this.i, this.b.C.b(this.f, 3.0D, this.f), this.a);
/* 47 */       if (((List)localObject).isEmpty()) return false;
/* 48 */       this.e = ((sa)((List)localObject).get(0));
/*    */     }
/*    */     
/* 51 */     Object localObject = vx.b(this.b, 16, 7, azw.a(this.e.s, this.e.t, this.e.u));
/* 52 */     if (localObject == null) return false;
/* 53 */     if (this.e.e(((azw)localObject).a, ((azw)localObject).b, ((azw)localObject).c) < this.e.f(this.b)) return false;
/* 54 */     this.g = this.h.a(((azw)localObject).a, ((azw)localObject).b, ((azw)localObject).c);
/* 55 */     if (this.g == null) return false;
/* 56 */     if (!this.g.b((azw)localObject)) return false;
/* 57 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 62 */     return !this.h.g();
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 67 */     this.h.a(this.g, this.c);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 72 */     this.e = null;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 77 */     if (this.b.f(this.e) < 49.0D) this.b.m().a(this.d); else {
/* 78 */       this.b.m().a(this.c);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */