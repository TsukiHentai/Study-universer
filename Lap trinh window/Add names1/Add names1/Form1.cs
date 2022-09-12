using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Add_names1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnAddname_Click(object sender, EventArgs e)
        {
            if (cmbTitle.SelectedIndex == -1)
            {
                MessageBox.Show("Bạn chưa chọn title");
            }
            else
                if (txtFirstname.Text == string.Empty)
            {
                MessageBox.Show("Bạn chưa nhập First name");
            }
            else
                if (txtLastname.Text == string.Empty)
            {
                MessageBox.Show("Bạn chưa nhập Last name");
            }
            else
                lsb.Items.Add(cmbTitle.Text + " " + txtFirstname.Text + " " + txtLastname.Text);
            //Help me =((
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            DialogResult a = MessageBox.Show("Bạn có muốn thoát chương trình?", "Thông báo", MessageBoxButtons.YesNo);
            if(a==DialogResult.Yes)
            {
                Application.Exit();
            }    
        }
    }
}
