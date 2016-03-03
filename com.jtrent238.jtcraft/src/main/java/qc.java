/*    */ import java.lang.reflect.Array;
/*    */ import java.util.concurrent.locks.Lock;
/*    */ import java.util.concurrent.locks.ReadWriteLock;
/*    */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*    */ 
/*    */ public class qc
/*    */ {
/*    */   private final Object[] a;
/*    */   private final Class b;
/* 10 */   private final ReadWriteLock c = new ReentrantReadWriteLock();
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   public qc(Class paramClass, int paramInt)
/*    */   {
/* 16 */     this.b = paramClass;
/* 17 */     this.a = ((Object[])Array.newInstance(paramClass, paramInt));
/*    */   }
/*    */   
/*    */   public Object a(Object paramObject) {
/* 21 */     this.c.writeLock().lock();
/*    */     
/* 23 */     this.a[this.e] = paramObject;
/* 24 */     this.e = ((this.e + 1) % b());
/* 25 */     if (this.d < b()) { this.d += 1;
/*    */     }
/* 27 */     this.c.writeLock().unlock();
/* 28 */     return paramObject;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int b()
/*    */   {
/* 39 */     this.c.readLock().lock();
/* 40 */     int i = this.a.length;
/* 41 */     this.c.readLock().unlock();
/* 42 */     return i;
/*    */   }
/*    */   
/*    */   public Object[] c()
/*    */   {
/* 47 */     Object[] arrayOfObject = (Object[])Array.newInstance(this.b, this.d);
/*    */     
/* 49 */     this.c.readLock().lock();
/* 50 */     for (int i = 0; i < this.d; i++) {
/* 51 */       int j = (this.e - this.d + i) % b();
/* 52 */       if (j < 0) j += b();
/* 53 */       arrayOfObject[i] = this.a[j];
/*    */     }
/* 55 */     this.c.readLock().unlock();
/*    */     
/* 57 */     return arrayOfObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */