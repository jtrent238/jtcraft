/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class us
/*    */   extends ui
/*    */ {
/*    */   private td a;
/*    */   private double b;
/*    */   private ayf c;
/*    */   private vy d;
/*    */   private boolean e;
/* 20 */   private List f = new ArrayList();
/*    */   
/*    */   public us(td paramtd, double paramDouble, boolean paramBoolean) {
/* 23 */     this.a = paramtd;
/* 24 */     this.b = paramDouble;
/* 25 */     this.e = paramBoolean;
/* 26 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 31 */     f();
/*    */     
/* 33 */     if ((this.e) && (this.a.o.w())) { return false;
/*    */     }
/* 35 */     vz localvz = this.a.o.A.a(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u), 0);
/* 36 */     if (localvz == null) { return false;
/*    */     }
/* 38 */     this.d = a(localvz);
/* 39 */     if (this.d == null) { return false;
/*    */     }
/* 41 */     boolean bool = this.a.m().c();
/* 42 */     this.a.m().b(false);
/* 43 */     this.c = this.a.m().a(this.d.a, this.d.b, this.d.c);
/* 44 */     this.a.m().b(bool);
/* 45 */     if (this.c != null) { return true;
/*    */     }
/* 47 */     azw localazw = vx.a(this.a, 10, 7, azw.a(this.d.a, this.d.b, this.d.c));
/* 48 */     if (localazw == null) return false;
/* 49 */     this.a.m().b(false);
/* 50 */     this.c = this.a.m().a(localazw.a, localazw.b, localazw.c);
/* 51 */     this.a.m().b(bool);
/* 52 */     return this.c != null;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 57 */     if (this.a.m().g()) return false;
/* 58 */     float f1 = this.a.M + 4.0F;
/* 59 */     return this.a.e(this.d.a, this.d.b, this.d.c) > f1 * f1;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 64 */     this.a.m().a(this.c, this.b);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 69 */     if ((this.a.m().g()) || (this.a.e(this.d.a, this.d.b, this.d.c) < 16.0D)) this.f.add(this.d);
/*    */   }
/*    */   
/*    */   private vy a(vz paramvz) {
/* 73 */     Object localObject = null;
/* 74 */     int i = Integer.MAX_VALUE;
/* 75 */     List localList = paramvz.f();
/* 76 */     for (vy localvy : localList) {
/* 77 */       int j = localvy.b(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u));
/* 78 */       if (j < i)
/* 79 */         if (!a(localvy)) {
/* 80 */           localObject = localvy;
/* 81 */           i = j;
/*    */         }
/*    */     }
/* 84 */     return (vy)localObject;
/*    */   }
/*    */   
/*    */   private boolean a(vy paramvy) {
/* 88 */     for (Iterator localIterator = this.f.iterator(); localIterator.hasNext(); 
/* 89 */         return true)
/*    */     {
/* 88 */       vy localvy = (vy)localIterator.next();
/* 89 */       if ((paramvy.a != localvy.a) || (paramvy.b != localvy.b) || (paramvy.c != localvy.c)) {} }
/* 90 */     return false;
/*    */   }
/*    */   
/*    */   private void f() {
/* 94 */     if (this.f.size() > 15) this.f.remove(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\us.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */